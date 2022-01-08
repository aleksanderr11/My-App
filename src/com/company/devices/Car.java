package com.company.devices;

import com.company.Human;

public abstract class Car extends Device {

    final String color;
    final boolean sportType;

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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        int sellerCarPosition = seller.findCarPosition(this);
        if(sellerCarPosition == -1 || !seller.getCar(sellerCarPosition).equals(this)){
            System.out.println("This car doesn't belong to this seller");
            throw new RuntimeException();
        }

        if(buyer.getCash() < price){
            System.out.println("Buyer hasn't got enough cash");
            throw new RuntimeException();
        }
        buyer.setCash(buyer.getCash()-price);
        seller.setCash(seller.getCash()+price);

        int buyerCarPosition = buyer.findFirstFreePosition();
        if(buyerCarPosition == -1){
            System.out.println("Buyer hasn't got free position in garage");
            throw new RuntimeException();
        }

        seller.setCarFromSecondHand(null, sellerCarPosition);
        buyer.setCarFromSecondHand(this, buyerCarPosition);

        System.out.println("Transaction successful");
    }

    public abstract void refuel();

}
