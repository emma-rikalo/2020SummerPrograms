package com.company;
//This program will output a person's gangsta name
//Version 2
//06/11/20
//Emma Rikalo

import java.util.*;

public class gangstaname_V2 {

    public static void main(String[] args) {
        GangstaName();
    }

    //create a method
    public static void GangstaName(){
        //create a string to represent the user's name
        String name;

        //create a scanner to receive input
        Scanner input= new Scanner (System.in);
        System.out.print("Type your name: ");

        //create Strings to represent the user's first and last names using indexOf
        String fName= input.nextLine();
        int indexOf= fName.indexOf(" ");
        String LName= fName.substring(indexOf+1);
        fName= fName.substring(0, indexOf);

        //print out the gangsta name, using charAt to print the initial, and toUpperCase to capitalize all of the last name
        System.out.print("Your gangsta name is: ");
        System.out.print(fName.charAt(0) + ". " + "Diddy " +LName.toUpperCase() + " " + fName + "-izzle");

    }


}

