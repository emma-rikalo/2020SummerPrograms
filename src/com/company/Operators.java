package com.company;
// Emma Rikalo
// 06/17/20
// This program will calculate the total cost of a meal using user-given input

//                         PSEUDOCODE:
// Declare the double mealCost, and the integers tipPercent and taxPercent
// Create a scanner
// Print prompts for each piece of data needed
// Follow each prompt with the initialization of the corresponding variable according to the input given
// Create the static void solve, and import the variables declared in step 1
// Declare double tip and set it equal to mealCost*(tipPercent/100)
// Declare double tax and set it equal to mealCost*(taxPercent/100)
// Declare double totalCost and set it equal to mealCost + tip + tax
// Print “Your total is: $” + the rounded version of totalCost

import java.util.*;
public class Operators {

    public static void main(String[] args) {

        //Declare the double mealCost, and the integers tipPercent and taxPercent
        double mealCost;
        int tipPercent;
        int taxPercent;

        //Create a scanner
        Scanner input= new Scanner (System.in);

        //print prompts/ initialize variables w/ input data
        System.out.println("Enter the meal's cost:");
        mealCost=input.nextDouble();

        System.out.println("Enter the tip percentage:");
        tipPercent=input.nextInt();

        System.out.println("Enter the tax percentage:");
        taxPercent=input.nextInt();

        //call method solve which will output the total
        solve(mealCost, tipPercent, taxPercent);
    }

    //Create the static void solve, and import the variables mealCost, tipPercent, and taxPercent
     static void solve(double mealCost, int tipPercent, int taxPercent){
        //solve for the tip, tax, and total according to the information previously given
        double tip= mealCost*(tipPercent/100);
        double tax= mealCost*(taxPercent/100);
        double totalCost= mealCost + tip + tax;
        //line break for formatting
        System.out.println();
        //typecast totalCost from double to int, and pring the total
        System.out.println("Your total is: $" + (int) totalCost);
    }

}

