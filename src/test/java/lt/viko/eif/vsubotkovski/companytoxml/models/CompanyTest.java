/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.vsubotkovski.companytoxml.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test of Company class.
 * 
 * @author valde
 */
public class CompanyTest {
    
    public CompanyTest() {
    }

    /**
     * Test of getCompanyName method, of class Company.
     */
    @Test
    public void testGetCompanyName() {
        System.out.println("getCompanyName");
        Company instance = new Company();
        String expResult = "my company name";
        instance.setCompanyName("my company name");
        String result = instance.getCompanyName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCompanyName method, of class Company.
     */
    @Test
    public void testSetCompanyName() {
        System.out.println("setCompanyName");
        String companyName = "";
        Company instance = new Company();
        instance.setCompanyName(companyName);
        
        String result = instance.getCompanyName();
        assertEquals(companyName, result);
    }

    /**
     * Test of getAdress method, of class Company.
     */
    @Test
    public void testGetAdress() {
        System.out.println("getAdress");
        Company instance = new Company();
        String expResult = "my adress";
        instance.setAdress("my adress");
        String result = instance.getAdress();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAdress method, of class Company.
     */
    @Test
    public void testSetAdress() {
        System.out.println("setAdress");
        String adress = "my adress";
        Company instance = new Company();
        instance.setAdress(adress);
        
        String result = instance.getAdress();
        assertEquals(adress, result);
    }

    /**
     * Test of getCity method, of class Company.
     */
    @Test
    public void testGetCity() {
        System.out.println("getCity");
        Company instance = new Company();
        String expResult = "my city";
        instance.setCity("my city");
        String result = instance.getCity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCity method, of class Company.
     */
    @Test
    public void testSetCity() {
        System.out.println("setCity");
        String city = "my city";
        Company instance = new Company();
        instance.setCity(city);
        
        String result = instance.getCity();
        assertEquals(city, result);
    }

    /**
     * Test of getUrlAdress method, of class Company.
     */
    @Test
    public void testGetUrlAdress() {
        System.out.println("getUrlAdress");
        Company instance = new Company();
        String expResult = "my url adress";
        instance.setUrlAdress("my url adress");
        String result = instance.getUrlAdress();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUrlAdress method, of class Company.
     */
    @Test
    public void testSetUrlAdress() {
        System.out.println("setUrlAdress");
        String urlAdress = "my url adress";
        Company instance = new Company();
        instance.setUrlAdress(urlAdress);
        
        String result = instance.getUrlAdress();
        assertEquals(urlAdress, result);
    }

    /**
     * Test of getTel method, of class Company.
     */
    @Test
    public void testGetTel() {
        System.out.println("getTel");
        Company instance = new Company();
        String expResult = "my tel";
        instance.setTel("my tel");
        String result = instance.getTel();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTel method, of class Company.
     */
    @Test
    public void testSetTel() {
        System.out.println("setTel");
        String tel = "my tel";
        Company instance = new Company();
        instance.setTel(tel);
        
        String result = instance.getTel();
        assertEquals(tel, result);
    }

    /**
     * Test of getVehicles method, of class Company.
     */
    @Test
    public void testGetVehicles() {
        System.out.println("getVehicles");
        Company instance = new Company();
        Vehicles expResult = null;
        Vehicles result = instance.getVehicles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVehicles method, of class Company.
     */
    @Test
    public void testSetVehicles() {
        System.out.println("setVehicles");
        Vehicles vehicles = null;
        Company instance = new Company();
        instance.setVehicles(vehicles);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Company.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Company instance = new Company();
        String result = instance.toString();
        assertTrue(result.contains("Company:"));
    }
    
}
