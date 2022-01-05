package com.company;

public class Human {

    Animal pet;
    private Car car;
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
