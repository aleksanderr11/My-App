package com.company.devices;

import com.company.Human;

import java.net.URL;
import java.util.List;

public class Phone extends Device {

    public static final String DEFAULT_SERVER_ADDRESS = "play.google.com";
    public static final String DEFAULT_PROTOCOL = "FTP";
    public static final String DEFAULT_VERSION = "LATEST";

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

    public void installAnApp(String appName){
        installAnApp(appName, DEFAULT_VERSION, DEFAULT_SERVER_ADDRESS);
    }
    public void installAnApp(String appName, String version){
        installAnApp(appName, version, DEFAULT_SERVER_ADDRESS);
    }
    public void installAnApp(String appName, String version, String serverAddress){
        System.out.println("Downloading "+appName);
        System.out.println("Version: "+version);
        System.out.println("Server address: "+serverAddress);
        System.out.println("Downloaded");
        System.out.println("Installing");
        System.out.println("Finished");
    }
    public void installAnApp(List<String> appNamesList) {
        for(String app : appNamesList){
            installAnApp(app);
        }
    }
    public void installAnApp(URL appUrl) {
        System.out.println("Download app from: "+appUrl.toString());
        System.out.println("Installing");
        System.out.println("Finished");
    }
}
