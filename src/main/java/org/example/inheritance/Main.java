package org.example.inheritance;

public class Main {
    public static void main(String[] args) {

        //Create objects
        Vehicle vehicle = new Vehicle("Airbus", "A380", 2023);
        Car car = new Car("BMW", "M3", 2019, 5);
        Motorcycle motorcycle = new Motorcycle("Honda", "Civic", 2018, "Sports");

        //Get info
        vehicle.getInfo();
        car.getInfo();
        motorcycle.getInfo();
    }
}
