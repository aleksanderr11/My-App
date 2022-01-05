package com.company;

public class Human {

    Animal pet;
    Car car;
    private Double salary;

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
        this.car = car;
    }

    public Double getSalary() {
        System.out.println("Actual salary: "+this.salary);
        return salary;
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
}
