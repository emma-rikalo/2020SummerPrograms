package com.company;
//Gregory Osler
//06/21/2020
//Pseudocode
//import the java.util.*
//then declare the char "letter"
//then create the main class
//declare the integer count
//declare the string s then string inputWord
//create a do statement in which it asks for words printed and do the input.nextInt()
//follow with a while to make sure that the words/letters coincide with the guidelines given
//create a for loop for the user to print his/her word and it to react
//create 2 string loops- 1 for the even letters and 1 for the odds
//put returns after the even loop and after the odd loop
import java.util.*;
public class peerreview {
    public static char letter;
    public static void main(String[] args) {
//        declaring variables and scanner
        Scanner input = new Scanner(System.in);
        int count;
        String s= "";
        String inputWord;
        do {
//            this is where the program will know how many times to repeat the word splitter
            System.out.println("How many words will you print(2 to 10)?");
            count = input.nextInt();
        } while (count < 2 || count > 10);
        for (int i = 0; i < count; i++) {
            do {

                System.out.println("Please print your word: ");
                inputWord = input.next();
            } while (inputWord.length() < 2 || inputWord.length() > 10000);
//this is where the even and odd letters get split up
            String newEven = even(inputWord);
            String newOdd = odd(inputWord);
            System.out.println(newEven+ " "+ newOdd);
        }
    }
    //    creating method for even letters
    public static String even(String s) {
        String newEvenWord= "";
        for (int index = 0; index < s.length(); index += 2) {
            char letter = s.charAt(index);
            newEvenWord= newEvenWord + letter;
        }
        return newEvenWord;
    }
    //      creating method for odd letters
    public static String odd (String s) {
        String newOddWord= "";
        for (int index = 1; index < s.length(); index += 2) {
            char letter = s.charAt(index);
            newOddWord= newOddWord + letter;
        }
        return newOddWord;
    }

}