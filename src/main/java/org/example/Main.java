package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //First Car
        Car car = new Car("BMW", "M3", "Blue", 2019, 100);
        car.startCar();
        car.stopCar();
        System.out.println(car);

        //Second Car
        Car car2 = new Car("Audi", "A4", "Red", 2018, 120);
        car2.startCar();
        car2.accelerate(70);
        System.out.println(car2.getSpeed());
        System.out.println(car2);
    }
}