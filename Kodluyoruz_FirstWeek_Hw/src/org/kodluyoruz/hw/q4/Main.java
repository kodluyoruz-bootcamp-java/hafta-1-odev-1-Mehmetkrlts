package org.kodluyoruz.hw.q4;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        double number;

        System.out.print("Welcome to number rounder!\nEnter a number:");
        number = scan.nextDouble();
        System.out.println("1-Round up\n2-Round down");
        rounder(number);
    }

    public static void rounder(double number){
        int choice = scan.nextInt();
        if(choice == 1){
            System.out.printf("You entered %.1f and your rounded number is:%.1f",number,Math.ceil(number));
        }
        else if (choice == 2) {
            System.out.printf("You entered %.1f and your rounded number is:%.1f",number,Math.floor(number));
        }
        else
            System.out.println("Wrong choice \n1-Round up\n2-Round down\n");
            rounder(number);
    }
}
