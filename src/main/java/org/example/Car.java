package org.example;

import java.util.Objects;

public class Car {

    private String brand;
    private String model;
    private String color;
    private int year;
    private int speed;

    public Car(String brand, String model, String color, int year, int speed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.speed = speed;
    }

    public void startCar() {
        System.out.println("Car started");
    }

    public void stopCar() {
        System.out.println("Car stopped");
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

    public void setSpeed(int speed) {
        this.speed = speed;
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

    public int getSpeed() {
        return speed;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Car car)) return false;
        return year == car.year && speed == car.speed && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, year, speed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", speed=" + speed +
                '}';
    }
}
