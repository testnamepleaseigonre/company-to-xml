/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template message, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.vsubotkovski.companytoxml.servers;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Java server logic.
 *
 * @author valde
 */
public class JavaServer {

    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter pwrt;
    private DataOutputStream out;
    private BufferedReader in;

    /**
     * A method to start the server.
     *
     * @param port - describes the connection port.
     * @throws IOException
     */
    public void start(int port) throws IOException {
        try {
            serverSocket = new ServerSocket(port);
            clientSocket = serverSocket.accept();
            pwrt = new PrintWriter(clientSocket.getOutputStream(), true);
            out = new DataOutputStream(clientSocket.getOutputStream());
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            String message = in.readLine();
            System.out.println("Message recieved: " + message);
            if ("Give me the package!".equals(message)) {
                File file = new File("company.xml");
                long length = file.length();
                if (length > Integer.MAX_VALUE) {
                    pwrt.println("File is too large.");
                    //System.out.println("File is too large.");
                } else {
                    InputStream in = new FileInputStream(file);
                    OutputStream out = clientSocket.getOutputStream();
                    pwrt.println("Take the package!");
                    byte[] bytes = new byte[16 * 1024];
                    int count;
                    while ((count = in.read(bytes)) > 0) {
                        out.write(bytes, 0, count);
                    }
                }
            } else {
                pwrt.println("Unrecognised greeting");
            }
        } catch (IOException ex) {
            System.out.println("Exception occured:" + ex.getMessage());
        } finally {
            stop();
        }
    }

    /**
     * Method that stops the server.
     *
     */
    private void stop() {
        try {
            in.close();
            out.close();
            pwrt.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException ex) {
            System.out.println("Exception occured: " + ex.getMessage());
        }
    }

    /**
     * Main method of JavaServer class.
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        JavaServer server = new JavaServer();
        server.start(6666);
    }
}
