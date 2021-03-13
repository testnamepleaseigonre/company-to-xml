package lt.viko.eif.vsubotkovski.companytoxml.models;

import javax.xml.bind.annotation.XmlElement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Car class which consist of parameters that describe the car. Model, date of manufacture, price, engine,
 * horse power, fuel type, gearbox, mileage, body type, number of doors, steering wheel, mot expiry, co2 emission.
 *
 * @author valde
 */
public class Car {

    private String model;
    private String dateOfManufacture;
    private String price;
    private String engine;
    private String hp;
    private String fuelType;
    private String gearbox;
    private String mileage;
    private String bodyType;
    private String numberOfDoors;
    private String steeringWheel;
    private String motExpiry;
    private String co2Emission;
    /**
     * Method to get car model.
     * 
     * @return 
     */
    public String getModel() {
        return model;
    }
    /**
     * Method to set car model.
     * 
     * @param model 
     */
    public void setModel(String model) {
        this.model = model;
    }
    /**
     * Method to get date of manufacture of a car.
     * 
     * @return 
     */
    public String getDateOfManufacture() {
        return dateOfManufacture;
    }
    /**
     * Method to set date of manufacture of a car.
     * 
     * @param dateOfManufacture 
     */
    @XmlElement(name = "date_of_manufacture")
    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }
    /**
     * Method to get car price.
     * 
     * @return 
     */
    public String getPrice() {
        return price;
    }
    /**
     * Method to set car price.
     * 
     * @param price 
     */
    public void setPrice(String price) {
        this.price = price;
    }
    /**
     * Method to get car engine volume.
     * 
     * @return 
     */
    public String getEngine() {
        return engine;
    }
    /**
     * Method to set car engine volume.
     * 
     * @param engine 
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }
    /**
     * Method to get car horse power.
     * 
     * @return 
     */
    public String getHp() {
        return hp;
    }
    /**
     * Method to set car horse power.
     * 
     * @param hp 
     */
    public void setHp(String hp) {
        this.hp = hp;
    }
    /**
     * Method to get car's fuel type.
     * 
     * @return 
     */
    public String getFuelType() {
        return fuelType;
    }
    /**
     * Method to set car's fuel type.
     * 
     * @param fuelType 
     */
    @XmlElement(name = "fuel_type")
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    /**
     * Method to get car's gearbox type.
     * 
     * @return 
     */
    public String getGearbox() {
        return gearbox;
    }
    /**
     * Method to set car's gearbox type.
     * 
     * @param gearbox 
     */
    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }
    /**
     * Method to get car's mileage.
     * 
     * @return 
     */
    public String getMileage() {
        return mileage;
    }
    /**
     * Method to set car's mileage.
     * 
     * @param mileage 
     */
    public void setMileage(String mileage) {
        this.mileage = mileage;
    }
    /**
     * Method to get car's body type.
     * 
     * @return 
     */
    public String getBodyType() {
        return bodyType;
    }
    /**
     * Method to set car's body type.
     * 
     * @param bodyType 
     */
    @XmlElement(name = "body_type")
    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }
    /**
     * Method to get number of doors of a car.
     * 
     * @return 
     */
    public String getNumberOfDoors() {
        return numberOfDoors;
    }
    /**
     * Method to set number of doors of a car.
     * 
     * @param numberOfDoors 
     */
    @XmlElement(name = "number_of_doors")
    public void setNumberOfDoors(String numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    /**
     * Method to get car's steering wheel location.
     * 
     * @return 
     */
    public String getSteeringWheel() {
        return steeringWheel;
    }
    /**
     * Method to set car's steering wheel location.
     * 
     * @param steeringWheel 
     */
    @XmlElement(name = "steering_wheel")
    public void setSteeringWheel(String steeringWheel) {
        this.steeringWheel = steeringWheel;
    }
    /**
     * Method to get car's mot expiry date.
     * 
     * @return 
     */
    public String getMotExpiry() {
        return motExpiry;
    }
    /**
     * Method to set car's mot expiry date.
     * 
     * @param motExpiry 
     */
    @XmlElement(name = "mot_expiry")
    public void setMotExpiry(String motExpiry) {
        this.motExpiry = motExpiry;
    }
    /**
     * Method to get car's co2 emission.
     * 
     * @return 
     */
    public String getCo2Emission() {
        return co2Emission;
    }
    /**
     * Method to set car's co2 emission.
     * 
     * @param co2Emission 
     */
    @XmlElement(name = "co2_emision")
    public void setCo2Emission(String co2Emission) {
        this.co2Emission = co2Emission;
    }
    /**
     * Method to return Car class in string type.
     * 
     * @return 
     */
    @Override
    public String toString() {
        return String.format("\n\tmodel = %s\n\tdate_of_manufacture = %s\n\tprice = %s\n\tengine = %s\n\thp = %s\n\tfuel_type = %s\n\tgearbox = %s\n\tmileage = %s\n\tbody_type = %s\n\tnumber_of_doors = %s\n\tsteering_wheel = %s\n\tmot_expiry = %s \n\tco2_emision = %s \n", model, dateOfManufacture, price, engine, hp, fuelType, gearbox, mileage, bodyType, numberOfDoors, steeringWheel, motExpiry, co2Emission);
    }

}
