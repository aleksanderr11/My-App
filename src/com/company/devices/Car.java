package com.company.devices;

public class Car {

    final String model;
    final String producer;
    final String color;
    final short yearOfProduction;
    final boolean sportType;
    Double value;

    public Car(String model, String producer, String color, short yearOfProduction, boolean sportType) {
        this.model = model;
        this.producer = producer;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
        this.sportType = sportType;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
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
