package com.company;
/*
Emma Rikalo & Sydney Pitts
06/25/20

Pseudocode:
Import Java.util.*
Import Java.io.*
Import Java.nio*
Create an overarching do while loop so that the game is replayable
Create println(“*********”)
Create println(“*WELCOME*”)
Create println(“*********”)
Create a scanner to receive user input
Ask whether the user wants to input, int, double, or strings
Create a new file and set it equal to the file that contains the answers
Create a new scanner to read through that file
Consume all the tokens, and sort them into 3 strings depending on var type
Call the corresponding method that will search for the user’s input in the string that contains the var they’re playing, and give the user points
Create method int
do
Create new scanner
Call string allIntegers (equal to all words in the file)
Declare a new empty string alreadyAnswered
Declare a new int Score
Ask user to input a number & give them the theme
Declare string answer = to user input
If (allIntegers.contains(“answer”) && alreadyAnswered.!contians(“answer”)
Set allIntegers = allIntegers.replace(
Then add answer to alreadyAnswered and add 1 to score
Ask if player wants to enter another int
While (answer =yes)
Return Score
Create methods double/string along the same lines w/ changes according to the different types of var.
While
Use scanner to ask user if they would like to play again
 */

//import needed classes
import java.util.*;
import java.io.*;

public class WordGame {
    //create global variables for the scores and the file's contents, as well as total # of times user has played
    public static String allFile = " ";
    public static int SCORE1;
    public static int SCORE2;
    public static int SCORE3;
    public static int total=0;

    public static void main(String[] args) throws FileNotFoundException{
        //create a variable to help with the replay process later on
        String replay;

        //create a welcome screen
        System.out.println("                 ************************");
        System.out.println("                 * WELCOME TO OUR GAME! *");
        System.out.println("                 ************************\n");

        //create a do while loop to run the game while the user continues to want to play
        do {

            //create a scanner, prompt, and string to gather user input
            Scanner input = new Scanner(System.in);
            System.out.println("Would you like to play with 'Integers', 'Doubles', or 'Words'?");
            String Mode = input.next();

            //this method reads/processes the file
            initialize();

            //if loops to jump to the method that deals with the mode the user chooses & get their score
            if ((Mode.contains(("Int")) || (Mode.contains("int")))){
                SCORE1 = intmode();
                System.out.println("Your Score is: " + SCORE1);
            } if ((Mode.contains(("Dou")) || (Mode.contains("dou")))){
                SCORE2 = doublemode();
                System.out.println("Your Score is: " + SCORE2);
            } if ((Mode.contains(("Wo")) || (Mode.contains("wo")))){
                SCORE3 = stringmode();
                System.out.println("Your Score is: " + SCORE3);
            }

            //once the user is done playing a mode, ask if they want to try a different one
            Scanner again = new Scanner(System.in);
            System.out.println("\nDo you want to play again in a different mode? 'yes'/'no'");
            replay = again.nextLine();

        } while (replay.contains("y"));
        //if not, end the game and print the overall score
        System.out.println("\nYou played "+total+" time(s), and your final score is: "+(SCORE1+SCORE2+SCORE3)+"\nThank You For Playing!");

    }

    //create a method for int mode
    public static int intmode() {
        //declare strings/int that'll be needed later
        String yesNo;
        int score = 0;
        String alreadyAnswered="";

       do {
           //scanner, prompt, int, and string to gather the user's integer
            Scanner in = new Scanner(System.in);
            System.out.println("Guess an integer 0-300");
            int answer = in.nextInt();
            String Answer = Integer.toString(answer);

            //if the answer is correct & hasn't been used before, add to the score, and total times they've played
            if (allFile.contains(Answer) && !alreadyAnswered.contains(Answer)) {
                alreadyAnswered = alreadyAnswered + Answer;
                score++;
                total++;
                //tell the user their updated score & ask if they want to guess again
                System.out.println("You Guessed Correctly! Your Score is now: " + score + "\nGuess again? 'yes'/'no'");

            } else {
                //if incorrect, tell the user their score & ask if they want to guess again, and add to their total games
                total++;
                System.out.println("You Guessed Incorrectly, your Score is still: "+score+ "\nGuess again? 'yes'/'no'");
            }
            //scanner/string to take the user's yes/no answer
            Scanner yN = new Scanner(System.in);
            yesNo = yN.next();

            //end the loop once the user stops saying yes
        } while((yesNo.contains("y"))||(yesNo.contains("Y")));
       //return the score to main
       return score;
    }

    //create a method for doubles, along the same lines as the int mode, just tailored towards a different var
    public static int doublemode() {
        String alreadyAnswered = "";
        int score = 0;
        String yesNo;

        do {

            Scanner in = new Scanner(System.in);
            System.out.println("Guess a double rounded to the tenths place 0-18");
            double answer = in.nextDouble();
            String Answer = Double.toString(answer);

            if (allFile.contains(Answer) && !alreadyAnswered.contains(Answer)) {
                alreadyAnswered = alreadyAnswered + Answer;
                score++;
                total++;
                System.out.println("You Guessed Correctly! Your Score is now: " + score + "\nGuess again? 'yes'/'no'");
            } else {
                System.out.println("You Guessed Incorrectly, your Score is still: "+score+ "\nGuess again? 'yes'/'no'");
                total++;
            }
            Scanner yN = new Scanner(System.in);
            yesNo = yN.next();
        } while((yesNo.contains("y"))||(yesNo.contains("Y")));
        return score;
    }

    //create a method for words, along the same lines as the int mode, just tailored towards a different var
    public static int stringmode() {
        int score = 0;
        String yesNo = " ";
        String alreadyAnswered = " ";

        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Guess a word that has to do with travel/vacation! Capitalize the first letter.");
            String Answer = in.nextLine();

            if (allFile.contains(Answer) && !alreadyAnswered.contains(Answer)) {
                alreadyAnswered = alreadyAnswered + Answer;
                score++;
                total++;
                System.out.println("You Guessed Correctly! Your Score is now: " + score + "\nGuess again? 'yes'/'no'");
            } else {
                System.out.println("You Guessed Incorrectly, your Score is still: "+score+ "\nGuess again? 'yes'/'no'");
               total++;
            }
            Scanner yN = new Scanner(System.in);
            yesNo = yN.next();
        } while((yesNo.contains("y"))||(yesNo.contains("Y")));
        return score;
    }

    //this method reads through the file, and processes the tokens in it
    public static void initialize() throws FileNotFoundException {
        //bring in the file/ read it with a scanner
        File file = new File("/Users/emma/IdeaProjects/summer2020/src/com/company/file.txt");
        Scanner read = new Scanner(file);

        //create an int and string to help process the file
        int i=0;
        String trash = " ";

        //add everything to an array & then convert into a string
        String [] File = new String[401];

        i=0;
        //make sure to read the entire file w/o going over
        while (read.hasNextLine()) {
            if (read.hasNext()) {
                //add to what we'll search through in the methods...
                i++;
                File[i] = read.next();
            } else {
                //...or discard
                trash = read.next();
            }
            //convert to a string to make it easier to work with later on
            allFile = Arrays.toString(File);
        }
    }
}

