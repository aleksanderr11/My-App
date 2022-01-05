package com.company;

public class Car {

    final String model;
    final String producer;
    final String color;
    final short yearOfProduction;
    final boolean sportType;

    public Car(String model, String producer, String color, short yearOfProduction, boolean sportType) {
        this.model = model;
        this.producer = producer;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
        this.sportType = sportType;
    }
}