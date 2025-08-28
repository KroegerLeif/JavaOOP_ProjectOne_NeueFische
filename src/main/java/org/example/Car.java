package org.example;

import java.util.Objects;

public class Car {

    private String brand;
    private String model;
    private String color;
    private int year;
    private int maxSpeed;
    private int speed;
    private int distance;
    private boolean isRunning;

    public Car(String brand, String model, String color, int year, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.maxSpeed = speed;

        //Standard values
        this.speed = 0;
        this.distance = 0;
        this.isRunning = false;
    }

    public void startCar() {
        System.out.println("Car started");
    }

    public void stopCar() {
        System.out.println("Car stopped");
    }

    public void accelerate(int acceleration) {
        speed += acceleration;
    }

    public void accelerate() {
        accelerate(10);
    }

    public void decelerate(int deceleration) {
        speed -= deceleration;
    }

    public void decelerate() {
        decelerate(10);
    }

    //SETTER

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }


    //GETTER

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDistance() {
        return distance;
    }

    public boolean getIsRunning() {
        return isRunning;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Car car)) return false;
        return year == car.year && maxSpeed == car.maxSpeed && speed == car.speed && distance == car.distance && isRunning == car.isRunning && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, year, maxSpeed, speed, distance, isRunning);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", maxSpeed=" + maxSpeed +
                ", speed=" + speed +
                ", distance=" + distance +
                ", isRunning=" + isRunning +
                '}';
    }
}
