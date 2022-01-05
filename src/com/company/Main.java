package com.company;

public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Animal("lacertilia");
        System.out.println("Start weight "+animal1.getWeight());
        animal1.feed();
        System.out.println("Feed 1 "+animal1.getWeight());
        animal1.feed();
        System.out.println("Feed 2 "+animal1.getWeight());
        animal1.takeForAWalk();
        System.out.println("Walk 1 "+animal1.getWeight());
        animal1.takeForAWalk();
        System.out.println("Walk 2 "+animal1.getWeight());
        animal1.takeForAWalk();
        System.out.println("Walk 3 "+animal1.getWeight());
        animal1.takeForAWalk();
        System.out.println("Walk 4 "+animal1.getWeight());
        animal1.takeForAWalk();
        animal1.feed();


    }
}
