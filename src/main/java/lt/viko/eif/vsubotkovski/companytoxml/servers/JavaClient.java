/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.vsubotkovski.companytoxml.servers;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Java client logic.
 * 
 * @author valde
 */
public class JavaClient {
    private Socket clientSocket;
    private PrintWriter out;
    //private BufferedReader in;
    private DataInputStream in;
    /**
     * Method to start connection.
     * 
     * @param ip - describes the IP adress.
     * @param port - describes the connection port.
     * @throws IOException 
     */
    public void startConnection(String ip, int port) throws IOException{
        clientSocket = new Socket(ip,port);
        out = new PrintWriter(clientSocket.getOutputStream(),true);
        //in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        in = new DataInputStream(new BufferedInputStream(clientSocket.getInputStream()));
    }
    /**
     * Method used to connect and send a message to the server.
     * 
     * @param msg - message of string type that is sent to the server.
     * @return
     * @throws IOException 
     */
    public String sendMessage(String msg) throws IOException{
        out.println(msg);
        String ans = in.readLine();
        if("Take the package!".equals(ans)){
            byte[] bites = new byte[16 * 1024];
            FileOutputStream fos = new FileOutputStream("downloaded_company.xml");
            int count;
            while((count = in.read(bites)) > 0){
                fos.write(bites, 0, count);
            }
        }
        return ans;
    }
    /**
     * Method used to stop the connection.
     * 
     */
    public void stopConnection(){
        try{
            in.close();
            out.close();
            clientSocket.close();
        }
        catch(IOException ex){
            System.out.println("Exception occured: " + ex.getMessage());
        }
    }
    /**
     * Main method of the JavaClient class.
     * 
     * @param args 
     */
    public static void main(String[] args){
        JavaClient client = new JavaClient();
        byte[] bytes = new byte[1];
        try{
            client.startConnection("127.0.0.1", 6666);
            String answer = client.sendMessage("Give me the package!");
            System.out.println("Server responded: " + answer);
        }
        catch(IOException ex){
            System.out.println("Exception occured" + ex.getMessage());
        }
        finally{
            client.stopConnection();
        }
    }
}

