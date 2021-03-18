/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.vsubotkovski.companytoxml.models;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test of Vehicles class.
 * 
 * @author valde
 */
public class VehiclesTest {
    
    public VehiclesTest() {
    }

    /**
     * Test of getCars method, of class Vehicles.
     */
    @Test
    public void testGetCars() {
        System.out.println("getCars");
        Vehicles instance = new Vehicles();
        List<Car> expResult = null;
        List<Car> result = instance.getCars();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCars method, of class Vehicles.
     */
    @Test
    public void testSetCars() {
        System.out.println("setCars");
        List<Car> cars = null;
        Vehicles instance = new Vehicles();
        instance.setCars(cars);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Vehicles.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vehicles instance = new Vehicles();
        String result = instance.toString();
        assertTrue(result.contains("Vehicles:"));
    }
    
}
