package com.company;
//Emma Rikalo
//06/18/20

//                PSEUDOCODE:
//Create a new Random
//Create int n with a random value between 1 and 137 inclusive
//Create a do while loop, so do 3-4...
//if (n%2 != 0) || (n%2==0 && 6<=n<=20)
//Print “Weird”
//else if n%2 == 0 &&  2<=n<=5 || n>20
//Print “Not Weird”
//Create a scanner
//Print “Try again? yes/no”
//Create string = to the input (yes) from the scanner
//… while char y is found in the string

//import the random/scanner classes
import java.util.*;
public class Conditional_Statements {

//create the public static string answer to recieve user input
public static String answer;

    public static void main(String[] args) {

        //create a new Random
        Random rand= new Random();

        //create a do while loop to repeat the program until a user stops it
        do{
            //create int n to have a random value 1-137 each time the loop runs
            int n= rand.nextInt(137)+1;

            //create an if loop to print "Weird" when n is either odd, or in the inclusive range 6-20
            if((n%2!=0) || (n%2==0 && ((6<=n && n<=20)))){
                System.out.println("Weird");
                System.out.println();
            }
            //add an else if to print "Not Weird" if n is even and not within the inclusive 6-20 range
            else if (n%2 == 0 && ((2<=n && n<=5) || n>20)){
                System.out.println("Not Weird");
                System.out.println();
            }

            //create a scanner and ask the user if they'd like to continue runnning the program
            Scanner input= new Scanner(System.in);
            System.out.println("Try Again? Enter 'yes'/'no'");
            answer = input.next();
            System.out.println();
        }
        //end the program once the user does not respond with yes
        while (answer.contains("y"));
    }
}
