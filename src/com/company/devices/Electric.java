package com.company.devices;

public class Electric extends Car{
    public Electric(String model, String producer, short yearOfProduction, String color, boolean sportType) {
        super(model, producer, yearOfProduction, color, sportType);
    }

    @Override
    public void refuel() {
        System.out.println("Car plugged-in to a chargepoint");
    }
}
