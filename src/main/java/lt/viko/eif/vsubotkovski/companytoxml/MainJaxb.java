/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.vsubotkovski.companytoxml;

import lt.viko.eif.vsubotkovski.companytoxml.models.Company;
import java.io.IOException;
import javax.xml.bind.JAXBException;
import lt.viko.eif.vsubotkovski.companytoxml.transform.Transformator;

/**
 * Main application method.
 * 
 * @author valde
 */
public class MainJaxb {

    public static void main(String[] args) throws JAXBException, IOException {
        Transformator transformator = new Transformator();
        Company company = transformator.transformToObject("company.xml");
        transformator.transformToXml(company);
    }
}
