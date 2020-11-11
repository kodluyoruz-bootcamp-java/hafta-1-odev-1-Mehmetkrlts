package org.kodluyoruz.hw.q1;

public class Main {

    public static void main(String[] args) {
        int n = 2000 ;
        float sum = 0;
        int numberOfDividers= 0;
        int i = 0;

        while(i < n) {
            if(i % 3 == 0 && i % 5 == 0 && i % 7 == 0 && i % 53 == 0) {
                sum += i;
                numberOfDividers++;
            }
            i += 53 ;
        }

        System.out.println("0 ile 2000 arasında 3,5,7 ve 53 ile bölünebilen sayıların ortalması:" + (sum/numberOfDividers));
    }
}
