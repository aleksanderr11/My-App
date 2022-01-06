package com.company.devices;

import com.company.Human;

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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(!seller.getPhone().equals(this) || buyer.getCash() < price){
            return;
        }
        buyer.setCash(buyer.getCash()-price);
        seller.setCash(seller.getCash()+price);

        seller.setPhone(null);
        buyer.setPhone(this);

        System.out.println("Transaction successful");
    }
}
