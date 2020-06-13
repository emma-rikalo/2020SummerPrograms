package com.company;
//This program will count letters in a phrase
//06/12/20
//Emma Rikalo

import java.util.*;

public class lettercounter {
    //create the global string firstWord so it can be easily called throughout the code
    public static String firstWord;

    public static void main(String[] args) {
      //create a scanner to receive the user's phrase
        Scanner input= new Scanner (System.in);
        System.out.print("Type a phrase: ");
      //create a string that contains the phrase
        String phrase= input.nextLine();
      //initialize firstWord as a substring containing only the first word of the phrase
        firstWord= phrase.substring(0, phrase.indexOf(' '));

        //create variable to count how many times a loop has repeated
        int loop = 0;
        //declare letter and set it equal to the char corresponding to the loop the program is on,
        //initially is the first character of the first word
        char letter = firstWord.charAt(loop++);
        //create strings to represent which letters no longer need to be counted,
        //and the final output of the program and initialize it
        String processedLetters = "";
        String finalOutput = "";

        //this is main while loop that will iterate over letters in firstword
        while (letter != ' ') {
            //initialize for each iteration
            int count = 0;
            int index = 0;

            //do loop that counts a letter only if it is contained in the phrase,
            //and hasn't been counted before. It will count all instances of such letter.
            do {
                if (letter == phrase.charAt(index) && !processedLetters.contains(Character.toString(letter)))
                    count++;
            }
            //continue this loop while the index is less than the length of the phrase
            while (index++ < (phrase.length() - 1));

            //continue this loop for the entirety of the first word to add letters to processedLetters once they've been counted
            // as well as to add counted letters to finalOutput
            if (loop <= firstWord.length()) {
                if (count>0)
                    //in this case it should go into finalOutput since it's the first time we encounter it
                    finalOutput = finalOutput + letter + " " + count + "\r\n";
                //add letter to processedLetters string, so that we will avoid counting it if it repeats
                processedLetters = processedLetters + Character.toString(letter);
                if(loop < firstWord.length())
                    letter = firstWord.charAt(loop++);
         //once any of the conditions for the previous loops are not met, break the loops
                else
                    break;
            } else
                break;
        }
        //print out the final counts of the letters in the first word
        System.out.println(finalOutput);
    }
}

