package com.company;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Arrays;

public class Human {

    Animal pet;
    private Car[] garage;
    private Double salary;
    Double cash;
    Phone phone;

    public Human() {
        this.garage = new Car[3];
    }

    public Human(int garageSize) {
        this.garage = new Car[garageSize];
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public Car getCar(int position) {
        if (position >= garage.length) {
            return null;
        }
        return garage[position];
    }

    public void setCar(Car car, int position) {
        if (position >= garage.length) {
            return;
        } else if (garage[position] != null) {
            return;
        }
        if (this.salary >= car.getValue()) {
            System.out.println("Car has been bought for cash");
            this.garage[position] = car;
            car.getOwners().add(this);
        } else if (this.salary >= car.getValue() / 12.0) {
            System.out.println("Car has been bought on credit");
            this.garage[position] = car;
            car.getOwners().add(this);
        } else {
            System.out.println("Find new job or get a pay rise");
        }
    }

    public void setCarFromSecondHand(Car car, int position) {
        if (position >= garage.length) {
            return;
        } else if (garage[position] != null) {
            return;
        }
        garage[position] = car;
        car.getOwners().add(this);
    }

    public Double getSalary() {
        System.out.println("Actual salary: " + this.salary);
        return salary;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public void setSalary(Double salary) {
        if (salary <= 0) {
            System.out.println("Salary should be more than 0");
            return;
        }
        System.out.println("New salary value: " + salary);
        System.out.println("Please contact HR departament to pick up contract amendment");
        System.out.println("Information about your new salary has been send to ZUS and US");
        this.salary = salary;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public int findCarPosition(Car car) {
        for (int i = 0; i < garage.length - 1; i++) {
            if (garage[i] == car) {
                return i;
            }
        }
        return -1;
    }

    public int findFirstFreePosition() {
        for (int i = 0; i < garage.length - 1; i++) {
            if (garage[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public Double garageValue() {
        Double sum = 0.0;
        for (Car car : this.garage) {
            if (car != null)
                sum += car.getValue();
        }
        return sum;
    }

    public void sortCars() {
        boolean flag = true;
        Car tmp;
        while (flag) {
            flag = false;
            for (int i = 0; i < garage.length - 1; i++) {
                if(garage[i] == null || garage[i+1] == null) continue;
                if (garage[i].getYearOfProduction() > garage[i + 1].getYearOfProduction()) {
                    tmp = garage[i];
                    garage[i] = garage[i + 1];
                    garage[i + 1] = tmp;
                    flag = true;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "pet=" + pet +
                ", garage=" + Arrays.toString(garage) +
                ", salary=" + salary +
                ", cash=" + cash +
                ", phone=" + phone +
                '}';
    }
}
