package com.company.devices;

public class Car extends Device {

    final String color;
    final boolean sportType;
    Double value;

    public Car(String model, String producer, short yearOfProduction, String color, boolean sportType) {
        super(model, producer, yearOfProduction);
        this.color = color;
        this.sportType = sportType;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public void turnOn() {
        System.out.println("The car has been started");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", color='" + color + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", sportType=" + sportType +
                ", value=" + value +
                '}';
    }
}
