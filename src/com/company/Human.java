package com.company;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Human {

    Animal pet;
    private Car car;
    private Double salary;
    Double cash;
    Phone phone;

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if(this.salary >= car.getValue()){
            System.out.println("Car has been bought for cash");
            this.car = car;
        } else if (this.salary >= car.getValue()/12.0){
            System.out.println("Car has been bought on credit");
            this.car = car;
        } else {
            System.out.println("Find new job or get a pay rise");
        }
    }

    public void setCarFromSecondHand(Car car){
        this.car = car;
    }

    public Double getSalary() {
        System.out.println("Actual salary: "+this.salary);
        return salary;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public void setSalary(Double salary) {
        if(salary <= 0){
            System.out.println("Salary should be more than 0");
            return;
        }
        System.out.println("New salary value: "+salary);
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

    @Override
    public String toString() {
        return "Human{" +
                "pet=" + pet +
                ", car=" + car +
                ", salary=" + salary +
                '}';
    }
}
