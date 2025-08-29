package org.example.inheritance;

public class Motorcycle extends Vehicle{
    private String type;

    public Motorcycle(String manufacturer, String model, int yearOfManufacture, String type) {
        super(manufacturer, model, yearOfManufacture);
        this.type = type;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Type: " + type);
    }

    public String getType() {
        return type;
    }
}
