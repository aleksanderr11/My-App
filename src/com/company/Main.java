package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

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
        Car car1 = new Car("A5", "Audi", (short) 2012, "red", true);
        human1.setSalary(120.0);
        car1.setValue(100.0);
        human1.setCar(car1);

        Car car2 = new Car("Mondeo", "Ford", (short) 2001, "blue", true);
        Car car3 = new Car("Mondeo", "Ford", (short) 2001, "blue", true);
        System.out.println(car2.equals(car3));
        System.out.println(car2);
        System.out.println(car3);

        Phone phone1 = new Phone("s11", "Samsung", (short) 2020);
        System.out.println(animal1);
        System.out.println(phone1);
        System.out.println(car1);
        System.out.println(human1);

        phone1.turnOn();
        car1.turnOn();

    }
}
