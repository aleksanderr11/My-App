package com.company.devices;

public class Phone extends Device {

    public Phone(String model, String producer, short yearOfProduction) {
        super(model, producer, yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println("The phone has been turned on");
    }

    @Override
    public String toString() {
        return "Phone{}";
    }
}
