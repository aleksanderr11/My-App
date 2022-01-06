package com.company;

public class Animal {

    final String species;
    private Double weight;
    private boolean isDead;

    public Animal(String species) {
        this.species = species;
        if (species.equals("felis")) {
            this.weight = 1.5;
        } else if (species.equals("canis")) {
            this.weight = 2.0;
        } else if (species.equals("aves")) {
            this.weight = 0.4;
        } else if (species.equals("lacertilia")) {
            this.weight = 0.1;
        } else {
            this.weight = 1.0;
        }
    }

    void feed() {
        if(isDead){
            System.out.println("Animal is dead");
            return;
        }
        this.weight += 0.1;
    }

    void takeForAWalk() {
        if(isDead){
            System.out.println("Animal is dead");
            return;
        }
        this.weight-= 0.1;
        if(this.weight <= 0){
            isDead = true;
        }
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                ", isDead=" + isDead +
                '}';
    }
}
