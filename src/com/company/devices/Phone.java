package com.company.devices;

import com.company.Application;
import com.company.Human;

import java.net.URL;
import java.util.*;

public class Phone extends Device {

    public static final String DEFAULT_SERVER_ADDRESS = "play.google.com";
    public static final String DEFAULT_PROTOCOL = "FTP";
    public static final String DEFAULT_VERSION = "LATEST";

    Human owner = null;
    Set<Application> applications = new HashSet<>();

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
        if (!seller.getPhone().equals(this) || buyer.getCash() < price) {
            return;
        }
        buyer.setCash(buyer.getCash() - price);
        seller.setCash(seller.getCash() + price);

        seller.setPhone(null);
        buyer.setPhone(this);

        System.out.println("Transaction successful");
    }

    public void installAnApp(String appName) {
        installAnApp(appName, DEFAULT_VERSION, DEFAULT_SERVER_ADDRESS);
    }

    public void installAnApp(String appName, String version) {
        installAnApp(appName, version, DEFAULT_SERVER_ADDRESS);
    }

    public void installAnApp(String appName, String version, String serverAddress) {
        System.out.println("Downloading " + appName);
        System.out.println("Version: " + version);
        System.out.println("Server address: " + serverAddress);
        System.out.println("Downloaded");
        System.out.println("Installing");
        System.out.println("Finished");
    }

    public void installAnApp(List<String> appNamesList) {
        for (String app : appNamesList) {
            installAnApp(app);
        }
    }

    public Human getOwner() {
        return owner;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }

    public void installAnApp(URL appUrl) {
        System.out.println("Download app from: " + appUrl.toString());
        System.out.println("Installing");
        System.out.println("Finished");
    }

    public void installAnApp(Application newApp) {
        if (owner.getCash() <= newApp.getPrice()) {
            System.out.println("Not enough money to buy this app");
            return;
        }
        applications.add(newApp);
        owner.setCash(owner.getCash() - newApp.getPrice());

    }

    public boolean isAnAppAlreadyInstalled(Application app) {
        return applications.contains(app);
    }

    public boolean isAnAppAlreadyInstalled(String appName) {
        for (Application app : applications) {
            if (Objects.equals(app.getName(), appName)) return true;
        }
        return false;
    }

    public void showAllFreeApps() {
        for (Application app : applications) {
            if (app.getPrice() == 0.0) System.out.println(app.getName());
        }
    }

    public Double appsValue() {
        Double sum = 0.0;
        for (Application app : applications) {
            sum += app.getPrice();
        }
        return sum;
    }

    public void showAllAppsInAlphabeticalOrder(){
        List<Application> applicationsList = new ArrayList<>(applications);
        applicationsList.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        for (Application app : applicationsList) System.out.println(app.getName());
    }

    public void showAllAppsInAscendingOrderByPrice() {
        List<Application> applicationsList = new ArrayList<>(applications);
        applicationsList.sort(Comparator.comparing(Application::getPrice));
        for (Application app : applicationsList) System.out.println(app.getName());
    }

}
