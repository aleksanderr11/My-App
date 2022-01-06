package com.company.devices;

import com.company.Sellable;

public abstract class Device implements Sellable {

    final String model;
    final String producer;
    final short yearOfProduction;

    public Device(String model, String producer, short yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }

    abstract void turnOn();

    @Override
    public String toString() {
        return "Device{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}