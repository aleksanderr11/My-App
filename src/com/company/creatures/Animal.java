package com.company.creatures;

import com.company.Sellable;

public abstract class Animal implements Sellable, Feedable {

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

    @Override
    public void feed() {
        feed(0.1);
    }

    @Override
    public void feed(Double foodWeight) {
        if(isDead){
            System.out.println("Animal is dead");
            return;
        }
        this.weight += foodWeight;
    }

    public void takeForAWalk() {
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
    public void sell(Human seller, Human buyer, Double price) {
        if(!seller.getPet().equals(this) || buyer.getCash() < price){
            return;
        }
        buyer.setCash(buyer.getCash()-price);
        seller.setCash(seller.getCash()+price);

        seller.setPet(null);
        buyer.setPet(this);

        System.out.println("Transaction successful");
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
