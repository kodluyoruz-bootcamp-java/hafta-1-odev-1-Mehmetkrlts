package org.kodluyoruz.hw.q2;

public class Car {
    String model;
    int year;
    String colour;

    public Car(String model , int year , String colour){
        this.year = year;
        this.model = model ;
        this.colour = colour;
        System.out.println("Car created");
    }

    public Car(String model , int year){
        this.year = year;
        this.model = model;
        System.out.println("Car created");
    }

    public Car(String model) {
        this.model = model;
        System.out.println("Car created");
    }
}
