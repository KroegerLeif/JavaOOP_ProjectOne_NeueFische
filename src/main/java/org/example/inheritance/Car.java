package org.example.inheritance;

public class Car extends Vehicle{
    private int numberOfDoors;

    public Car(String manufacturer, String model, int yearOfManufacture, int numberOfDoors) {
        super(manufacturer, model, yearOfManufacture);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Number of doors: " + numberOfDoors);
    }
}
