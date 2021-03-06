package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Diesel;
import com.company.devices.Electric;
import com.company.devices.Phone;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Pet("lacertilia");
        animal1.feed();
        animal1.feed();
        animal1.takeForAWalk();
        animal1.takeForAWalk();
        animal1.takeForAWalk();
        animal1.takeForAWalk();
        animal1.takeForAWalk();
        animal1.feed();

        Human human1 = new Human();
        Car car1 = new Diesel("A5", "Audi", (short) 2012, "red", true);
        human1.setSalary(120.0);
        car1.setValue(100.0);
        human1.setCar(car1, 0);

        Car car2 = new Diesel("Mondeo", "Ford", (short) 2001, "blue", true);
        Car car3 = new Diesel("Mondeo", "Ford", (short) 2001, "blue", true);
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

        Human human2 = new Human();
        Human human3 = new Human();
        human2.setPet(animal1);
        human2.setCash(10.0);
        human3.setCash(200.0);
        animal1.sell(human2, human3, 50.0);
        System.out.println(human2.getCash());
        System.out.println(human3.getCash());
        System.out.println(human2.getPet());
        System.out.println(human3.getPet());

        human3.setPhone(phone1);
        phone1.sell(human3, human2, 40.0);
        System.out.println(human2.getCash());
        System.out.println(human3.getCash());

        human1.setCash(300.0);
        car1.sell(human1, human3, 150.0);
        System.out.println(human1.getCash());
        System.out.println(human3.getCash());

        Animal animal2 = new FarmAnimal("aves");
        animal2.feed(1.0);
        animal2.takeForAWalk();
        System.out.println(animal2.getWeight());

        String snapchatApp = "Snapchat";
        String instagramApp = "Instagram";
        String allegroApp = "Allegro";
        List<String> appList = new ArrayList<>();
        appList.add(snapchatApp);
        appList.add(instagramApp);
        appList.add(allegroApp);
        phone1.installAnApp(appList);
        phone1.installAnApp("WhatsApp", "2.21.24.22", "www.whatsapp.com");

        car1.refuel();
        Car car4 = new Electric("S", "Tesla", (short) 2021, "red", true);
        car4.setValue(55.5);
        car4.refuel();

        Human human4 = new Human();
        human4.setSalary(500.0);
        human4.setCash(700.0);
        human4.setCar(car4, 0);
        car1.sell(human3, human4, 10.0);
        System.out.println(human4.garageValue());
        human4.sortCars();
        System.out.println(human4);

        System.out.println(car1.wasOwnedBy(human1));
        System.out.println(car1.wasTradedBetween(human3, human4));
        System.out.println(car1.wasTradedBetween(human3, human1));

        car1.sell(human4, human2, 10.0);
        car1.sell(human2, human1, 5.0);
        System.out.println(car1.numberOfTransactions());

        human2.setCash(900.0);
        Application facebook = new Application("Facebook", "2.0", 5.0);
        Application whatsApp = new Application("WhatsApp", "5.0 BETA", 10.0);
        Application zalando = new Application("Zalando", "9.0.1", 0.0);
        Application uber = new Application("Uber", "1.1.5", 20.0);
        Application maps = new Application("Google Maps", "10.1.5", 0.0);
        phone1.installAnApp(facebook);
        phone1.installAnApp(whatsApp);
        phone1.installAnApp(zalando);
        phone1.installAnApp(uber);
        phone1.installAnApp(maps);
        System.out.println(phone1.isAnAppAlreadyInstalled(facebook));
        System.out.println(phone1.isAnAppAlreadyInstalled("Uber"));
        phone1.showAllFreeApps();
        System.out.println(phone1.appsValue());
        phone1.showAllAppsInAlphabeticalOrder();
        System.out.println("~~");
        phone1.showAllAppsInAscendingOrderByPrice();

    }
}
