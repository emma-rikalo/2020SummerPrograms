package com.company;

import java.util.*;
public class twentymin {

    public static void main(String[] args) {
       double height1;
       double weight1;
       double height2;
       double weight2;
       double BMI1;
       double BMI2;

        Scanner input= new Scanner (System.in);
        System.out.println("Enter person 1's height (in inches)");
        height1=input.nextDouble();

        System.out.println("Enter person 1's weight (in pounds)");
        weight1=input.nextDouble();

        BMI1= ((weight1/Math.pow(height1,2))*703);

        System.out.println("Enter person 2's height (in inches)");
        height2=input.nextDouble();

        System.out.println("Enter person 2's weight (in pounds)");
        weight2=input.nextDouble();

        BMI2= ((weight2/Math.pow(height2,2))*703);

        //line break
        System.out.println();

        //print out person 1's BMI info
        System.out.println("Person 1's BMI is: " + BMI1);
        if (BMI1 < 18.5 ) {
            System.out.print("Underweight");
        }

        else if (BMI1 >= 18.5 && BMI1 < 25) {
            System.out.print("Normal");
        }

        else if (BMI1 >= 25 && BMI1 < 30) {
            System.out.print("Overweight");
        }

        else if (BMI1 >= 30) {
            System.out.print("Obese");
        }

        //line breaks
        System.out.println();
        System.out.println();

        //print out person 2's BMI info
        System.out.println("Person 2's BMI is: " + BMI2);

        if (BMI2 < 18.5 ) {
            System.out.print("Underweight");
        }

        else if (BMI2 >= 18.5 && BMI2 < 25) {
            System.out.print("Normal");
        }

        else if (BMI2 >= 25 && BMI2 < 30) {
            System.out.print("Overweight");
        }

        else if (BMI1 >= 30) {
            System.out.print("Obese");
        }


    }

}

