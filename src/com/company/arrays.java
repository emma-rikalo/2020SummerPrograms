package com.company;
import java.util.*;

public class arrays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many days' temperatures? ");
        int numdays = input.nextInt();
        int[] temp = new int[numdays];
        int sum = 0;

        Random number= new Random();


        for (int daysprinted = 0; daysprinted < numdays; daysprinted++) {
            temp[daysprinted] = number.nextInt(85)+25;
            System.out.println("Day " + (daysprinted + 1) + "'s high temp: " + temp[daysprinted]);
            sum += temp[daysprinted];
        }

        double average = (double) sum / numdays;
        int count = 0;

        for (int i = 0; i < numdays; i++) {
            if (temp[i] > average) {
                count++;
            }
        }
        System.out.printf("Average temp = %.1f\n", average);
        System.out.println(count + " days above average.");
    }
}




