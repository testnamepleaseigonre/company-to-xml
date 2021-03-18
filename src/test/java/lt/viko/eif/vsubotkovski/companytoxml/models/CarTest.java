/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.vsubotkovski.companytoxml.models;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test of Car class.
 * 
 * @author valde
 */
public class CarTest {
    
    public CarTest() {
    }
    
    /**
     * Test of getModel method, of class Car.
     */
    @org.junit.jupiter.api.Test
    public void testGetModel() {
        System.out.println("getModel");
        Car instance = new Car();
        String expResult = "Car model";
        instance.setModel("Car model");
        String result = instance.getModel();
        assertEquals(expResult, result);
    }

    /**
     * Test of setModel method, of class Car.
     */
    @org.junit.jupiter.api.Test
    public void testSetModel() {
        System.out.println("setModel");
        String model = "My model";
        Car instance = new Car();
        instance.setModel(model);
        
        String result = instance.getModel();
        assertEquals(model, result);
    }

    /**
     * Test of getDateOfManufacture method, of class Car.
     */
    @org.junit.jupiter.api.Test
    public void testGetDateOfManufacture() {
        System.out.println("getDateOfManufacture");
        Car instance = new Car();
        String expResult = "My date of manufacture";
        instance.setDateOfManufacture("My date of manufacture");
        String result = instance.getDateOfManufacture();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDateOfManufacture method, of class Car.
     */
    @org.junit.jupiter.api.Test
    public void testSetDateOfManufacture() {
        System.out.println("setDateOfManufacture");
        String dateOfManufacture = "My date of manufacture";
        Car instance = new Car();
        instance.setDateOfManufacture(dateOfManufacture);
        
        String result = instance.getDateOfManufacture();
        assertEquals(dateOfManufacture, result);
    }

    /**
     * Test of getPrice method, of class Car.
     */
    @org.junit.jupiter.api.Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Car instance = new Car();
        String expResult = "my price";
        instance.setPrice("my price");
        String result = instance.getPrice();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPrice method, of class Car.
     */
    @org.junit.jupiter.api.Test
    public void testSetPrice() {
        System.out.println("setPrice");
        String price = "my price";
        Car instance = new Car();
        instance.setPrice(price);
        
        String result = instance.getPrice();
        assertEquals(price, result);
    }

    /**
     * Test of getEngine method, of class Car.
     */
    @org.junit.jupiter.api.Test
    public void testGetEngine() {
        System.out.println("getEngine");
        Car instance = new Car();
        String expResult = "my engine";
        instance.setEngine("my engine");
        String result = instance.getEngine();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEngine method, of class Car.
     */
    @org.junit.jupiter.api.Test
    public void testSetEngine() {
        System.out.println("setEngine");
        String engine = "my engine";
        Car instance = new Car();
        instance.setEngine(engine);
        
        String result = instance.getEngine();
        assertEquals(engine, result);
    }

    /**
     * Test of getHp method, of class Car.
     */
    @org.junit.jupiter.api.Test
    public void testGetHp() {
        System.out.println("getHp");
        Car instance = new Car();
        String expResult = "my hp";
        instance.setHp("my hp");
        String result = instance.getHp();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHp method, of class Car.
     */
    @org.junit.jupiter.api.Test
    public void testSetHp() {
        System.out.println("setHp");
        String hp = "my hp";
        Car instance = new Car();
        instance.setHp(hp);
        
        String result = instance.getHp();
        assertEquals(hp, result);
    }

    /**
     * Test of getFuelType method, of class Car.
     */
    @org.junit.jupiter.api.Test
    public void testGetFuelType() {
        System.out.println("getFuelType");
        Car instance = new Car();
        String expResult = "my fuel type";
        instance.setFuelType("my fuel type");
        String result = instance.getFuelType();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFuelType method, of class Car.
     */
    @org.junit.jupiter.api.Test
    public void testSetFuelType() {
        System.out.println("setFuelType");
        String fuelType = "my fuel type";
        Car instance = new Car();
        instance.setFuelType(fuelType);
        
        String result = instance.getFuelType();
        assertEquals(fuelType, result);
    }

    /**
     * Test of getGearbox method, of class Car.
     */
    @org.junit.jupiter.api.Test
    public void testGetGearbox() {
        System.out.println("getGearbox");
        Car instance = new Car();
        String expResult = "my gearbox";
        instance.setGearbox("my gearbox");
        String result = instance.getGearbox();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGearbox method, of class Car.
     */
    @org.junit.jupiter.api.Test
    public void testSetGearbox() {
        System.out.println("setGearbox");
        String gearbox = "my gearbox";
        Car instance = new Car();
        instance.setGearbox(gearbox);
        
        String result = instance.getGearbox();
        assertEquals(gearbox, result);
    }

    /**
     * Test of getMileage method, of class Car.
     */
    @org.junit.jupiter.api.Test
    public void testGetMileage() {
        System.out.println("getMileage");
        Car instance = new Car();
        String expResult = "my mileage";
        instance.setMileage("my mileage");
        String result = instance.getMileage();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMileage method, of class Car.
     */
    @org.junit.jupiter.api.Test
    public void testSetMileage() {
        System.out.println("setMileage");
        String mileage = "";
        Car instance = new Car();
        instance.setMileage(mileage);
        
        String result = instance.getMileage();
        assertEquals(mileage, result);
    }

    /**
     * Test of getBodyType method, of class Car.
     */
    @org.junit.jupiter.api.Test
    public void testGetBodyType() {
        System.out.println("getBodyType");
        Car instance = new Car();
        String expResult = "my body type";
        instance.setBodyType("my body type");
        String result = instance.getBodyType();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBodyType method, of class Car.
     */
    @org.junit.jupiter.api.Test
    public void testSetBodyType() {
        System.out.println("setBodyType");
        String bodyType = "";
        Car instance = new Car();
        instance.setBodyType(bodyType);
        
        String result = instance.getBodyType();
        assertEquals(bodyType, result);
    }

    /**
     * Test of getNumberOfDoors method, of class Car.
     */
    @org.junit.jupiter.api.Test
    public void testGetNumberOfDoors() {
        System.out.println("getNumberOfDoors");
        Car instance = new Car();
        String expResult = "my doors";
        instance.setNumberOfDoors("my doors");
        String result = instance.getNumberOfDoors();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumberOfDoors method, of class Car.
     */
    @org.junit.jupiter.api.Test
    public void testSetNumberOfDoors() {
        System.out.println("setNumberOfDoors");
        String numberOfDoors = "";
        Car instance = new Car();
        instance.setNumberOfDoors(numberOfDoors);
        
        String result = instance.getNumberOfDoors();
        assertEquals(numberOfDoors, result);
    }

    /**
     * Test of getSteeringWheel method, of class Car.
     */
    @org.junit.jupiter.api.Test
    public void testGetSteeringWheel() {
        System.out.println("getSteeringWheel");
        Car instance = new Car();
        String expResult = "my wheel";
        instance.setSteeringWheel("my wheel");
        String result = instance.getSteeringWheel();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSteeringWheel method, of class Car.
     */
    @org.junit.jupiter.api.Test
    public void testSetSteeringWheel() {
        System.out.println("setSteeringWheel");
        String steeringWheel = "";
        Car instance = new Car();
        instance.setSteeringWheel(steeringWheel);
        
        String result = instance.getSteeringWheel();
        assertEquals(steeringWheel, result);
    }

    /**
     * Test of getMotExpiry method, of class Car.
     */
    @org.junit.jupiter.api.Test
    public void testGetMotExpiry() {
        System.out.println("getMotExpiry");
        Car instance = new Car();
        String expResult = "my mot expiry";
        instance.setMotExpiry("my mot expiry");
        String result = instance.getMotExpiry();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMotExpiry method, of class Car.
     */
    @org.junit.jupiter.api.Test
    public void testSetMotExpiry() {
        System.out.println("setMotExpiry");
        String motExpiry = "";
        Car instance = new Car();
        instance.setMotExpiry(motExpiry);
        
        String result = instance.getMotExpiry();
        assertEquals(motExpiry, result);
    }

    /**
     * Test of getCo2Emission method, of class Car.
     */
    @org.junit.jupiter.api.Test
    public void testGetCo2Emission() {
        System.out.println("getCo2Emission");
        Car instance = new Car();
        String expResult = "my emission";
        instance.setCo2Emission("my emission");
        String result = instance.getCo2Emission();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCo2Emission method, of class Car.
     */
    @org.junit.jupiter.api.Test
    public void testSetCo2Emission() {
        System.out.println("setCo2Emission");
        String co2Emission = "";
        Car instance = new Car();
        instance.setCo2Emission(co2Emission);
        
        String result = instance.getCo2Emission();
        assertEquals(co2Emission, result);
    }

    /**
     * Test of toString method, of class Car.
     */
    @org.junit.jupiter.api.Test
    public void testToString() {
        System.out.println("toString");
        Car instance = new Car();
        //String expResult = "";
        
        String result = instance.toString();
        assertTrue(result.contains("model ="));
    }
}
