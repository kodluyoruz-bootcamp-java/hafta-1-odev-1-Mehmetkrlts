package org.kodluyoruz.hw.q2;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Bmw");
        Car car1 = new Car("Audi" , 2007) ;
        Car car2 = new Car("Mazda", 2020 , "White");

        System.out.println(car.model);
        System.out.println(car1.model);
        System.out.println(car2.model);

    }
}
