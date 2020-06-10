package com.company;
//This program will output a person's gangsta name
//06/10/20
//Emma

import java.util.*;
public class gangstaname {


    public static void main(String[] args) {
       //create a string to represent the user's name
       String name;

       //create a scanner to receive input
       Scanner input= new Scanner (System.in);

       System.out.print("Type your name, playa:");

       //create 2 strings to represent the user's first and last names
       String fName= input.next();
       String LName= input.nextLine();

       //print out the gangsta name, using charAt to print the initial, and toUpperCase to capitalize all of the last name
       System.out.print("Your gangsta name is: ");
       System.out.print(fName.charAt(0) + ". " + "Diddy" + LName.toUpperCase() + " " + fName + "-izzle");

    }

}

