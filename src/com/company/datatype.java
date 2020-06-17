package com.company;
// Emma Rikalo
// 06/16/20
// This program will take user input and add together 2 integers, then 2 doubles,
// then concat the original string with a user given ending


//                                   PSEUDOCODE
//        Declare and initialize int i=4;, double d=4.0;, and String s= “Greenhill”;
//        Create a Scanner
//        Declare another int, double, and string
//        Print something along the lines of “type in an integer, a double, and part of a phrase”
//        Have the scanner read 3 lines of input,
//        Have them correspond to the next int, next double, etc.
//        Set the int, double, and string declared in step 3 equal to the input given in step 4
//        Print i + int input
//        Print d + double input (scaled to one decimal place)
//        Print s concat string input


import java.util.*;

public class datatype {

    public static void main(String[] args) {

        //Declare and initialize int i=4;, double d=4.0;, and String s= “Greenhill”;
        int i = 4;
        double d= 4.0;
        String s= "Greenhill ";

        //Create a Scanner
        Scanner input= new Scanner (System.in);

        //Declare another int, double, and string
        int number;
        double decimal;
        String words;

        //Print a prompt; set int number equal to the user given integer
        System.out.println("Type an integer: ");
        number = input.nextInt();

        //Print a prompt; set double decimal equal to the user given double
        System.out.println("Type a double: ");
        decimal = input.nextDouble();

        //Print a prompt; set words equal to the user given phrase
        System.out.println("Finish the phrase: Greenhill... ");
        words = (input.next() + input.nextLine());

        //a line break to separate the input section and output section when the program runs
        System.out.println();

        //Print the final outcomes of all the math/ concat
        System.out.println(i + number);
        System.out.printf("%.1f \n", (d + decimal));
        System.out.println(s.concat(words));
    }
}

