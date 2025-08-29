package org.example.inheritance;

import java.util.Objects;

public class Vehicle {
    private String manufacturer;
    private String model;
    private int yearOfManufacture;

    //CONSTRUCTOR
    public Vehicle(String manufacturer, String model, int yearOfManufacture) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    //Methods
    public void getInfo(){
        System.out.println("Manufacturer: " + manufacturer + "\nModel: " + model + "\nYear of manufacture: " + yearOfManufacture);
    }

    //GETTERS AND SETTERS
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    //Equals and Hashcode
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Vehicle vehicle)) return false;
        return yearOfManufacture == vehicle.yearOfManufacture && Objects.equals(manufacturer, vehicle.manufacturer) && Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, model, yearOfManufacture);
    }

    //TO STRING
    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}
