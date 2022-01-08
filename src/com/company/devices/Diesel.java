package com.company.devices;

public class Diesel extends Car{
    public Diesel(String model, String producer, short yearOfProduction, String color, boolean sportType) {
        super(model, producer, yearOfProduction, color, sportType);
    }

    @Override
    public void refuel() {
        System.out.println("Refueling car with diesel");
    }
}
