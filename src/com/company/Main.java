package com.company;

public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Animal("lacertilia");
        animal1.feed();
        animal1.feed();
        animal1.takeForAWalk();
        animal1.takeForAWalk();
        animal1.takeForAWalk();
        animal1.takeForAWalk();
        animal1.takeForAWalk();
        animal1.feed();

        Human human1 = new Human();
        Car car1 = new Car("A5", "Audi", "red", (short) 2012, true);
        human1.setCar(car1);

    }
}
