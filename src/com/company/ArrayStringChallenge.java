package com.company;
//Emma Rikalo
//06/22/20

//Pseudocode:
//Create a scanner
//Declare an Int T to be equal to the input number of test cases (words)
//1<=T<=10
//Create an array, and set it equal to the user input; the array will contain all of the words input
//   -make it receive input T times
//Break each word in it according to odd/even indexed chars
//   -do this with the same process as the previous program
//create a new array containing the same set of words, arranged into their final form
//Print the array


//import all needed classes
import java.util.*;

public class ArrayStringChallenge {

    public static void main(String[] args) {

        //create int T to represent the # of words that will be input
        int T;

        //create a scanner for user input
        Scanner input = new Scanner(System.in);

      //create a boolean to check that T fits the requirements/ give user a second chance to input later on
        boolean correctinput = false;
        //create loops to facilitate the program taking user input for T
        do {
            //prompt the user & set T equal to their input if it is valid
            System.out.println("Enter an integer 1-10");
            T = input.nextInt();
            //check if T fits the requirements, if not give user ability to redo their input
            if (T < 1 || T > 10) {
                System.out.println("T must be an integer 1-10");
            } else {
                correctinput = true;
            }
        } while (!correctinput) ;

        //prompt the user to enter the correct number of words
        System.out.println("Enter " + T + " word(s), one per line: ");

        //create an array to house the user's words all at once
        String[] inS = new String[T];

        //inS is a array of input words; add each new word to the array until T number of words is reached
        for (int counter = 0; counter < T; counter++) {
            inS[counter] = inputWord(input);
        }

        //create an array to house the words once they are rearranged
        String[] outS = new String[T];

        //add all the rearranged words to the array
        for (int counter = 0; counter < T; counter++) {
            outS[counter] = outputWord(inS[counter]);
        }

        //print the outS array
        System.out.println(" ");
        for (int counter = 0; counter < T; counter++) {
            System.out.println(outS[counter]);
        }
    }

    //create a method to collect the input words
    public static String inputWord(Scanner input) {
        String w= input.next();

        //check to make sure the length fits the parameters; if not prompt the user to reenter their input
        if(2>=w.length() || w.length()>=10000){
            boolean correctinput = false;
            do {
                System.out.println("Enter a word with 2-10000 characters");
                w=input.next();
                if(2<=w.length() && w.length()<=10000) {
                    correctinput = true;
                }
            } while (!correctinput) ;
        }
        //return the list of input words to the array
        return w;
    }

    //create a method to rearrange the array's contents
    public static String outputWord(String word){

        //split into even/odd
        String even= "";
        String odd="";

        //gather all even chars
        for(int index=0; index<word.length(); index+=2){
            even = even + word.charAt(index);
        }

        //gather all odd chars
        for(int index=1; index<word.length(); index+=2) {
            odd = odd + word.charAt(index);
        }

        //create the rearranged word
        String answer= even + "  " + odd;
        //return the output to the corresponding array
        return answer;
    }
}
