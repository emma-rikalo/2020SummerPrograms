package com.company;

//CURRENT ISSUES: only recognizes the last answer as existing, can't differentiate between int/dou

import java.util.*;
import java.io.*;

public class WordGame {
    public static String allINT = " ";
    public static String allDOUBLE = " ";
    public static String allWORD = " ";


    public static void main(String[] args) throws FileNotFoundException{
        String replay ="";
        System.out.println("WELCOME!");

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Would you like to play with 'Integers', 'Doubles', or 'Words'?");
            String Mode = input.next();

            initialize();

            if ((Mode.contains(("Int")) || (Mode.contains("int")))){
                int SCORE = intmode();
                System.out.println("Your Final Score is: " + SCORE);
            } if ((Mode.contains(("Dou")) || (Mode.contains("dou")))){
                int SCORE = doublemode();
                System.out.println("Your Final Score is: " + SCORE);
            } if ((Mode.contains(("Wo")) || (Mode.contains("wo")))){
                int SCORE = stringmode();
                System.out.println("Your Final Score is: " + SCORE);
            }
            Scanner again = new Scanner(System.in);
            System.out.println("\nDo you want to play again in a different mode? 'yes'/'no'");
            replay = again.nextLine();
        } while (replay.contains("y"));

    }

    public static int intmode() {
        String yesNo;
        int score = 0;
        String alreadyAnswered = "";
        System.out.println(allINT);

       do {
            Scanner in = new Scanner(System.in);
            System.out.println("Guess an integer 0-300");
            int answer = in.nextInt();
            String Answer = Integer.toString(answer);

            if (allINT.contains(Answer) && !alreadyAnswered.contains(Answer)) {
                alreadyAnswered = alreadyAnswered + Answer;
                score++;
                System.out.println("You Guessed Correctly! Your Score is now: " + score + "\nPlay again? 'yes'/'no'");

            } else {
                System.out.println("You Guessed Incorrectly, play integers again? 'yes'/'no'");
            }
            Scanner yN = new Scanner(System.in);
            yesNo = yN.next();

        } while(yesNo.contains("y"));

       return score;
    }

    public static int doublemode() {
        String alreadyAnswered = "";
        int score = 0;
        String yesNo;
        System.out.println(allDOUBLE);

        do {

            Scanner in = new Scanner(System.in);
            System.out.println("Guess a double rounded to the tenths place 0-15");
            double answer = in.nextDouble();
            String Answer = Double.toString(answer);

            if (allDOUBLE.contains(Answer) && !alreadyAnswered.contains(Answer)) {
                alreadyAnswered = alreadyAnswered + Answer;
                score++;
                System.out.println("You Guessed Correctly! Your Score is now: " + score + "\nPlay again? 'yes'/'no'");
                Scanner yN = new Scanner(System.in);
                yesNo = yN.next();
            } else {
                System.out.println("You Guessed Incorrectly, play doubles again? 'yes'/'no'");
                Scanner yN = new Scanner(System.in);
                yesNo = yN.next();
            }

        } while (yesNo.contains("y"));
        return score;
    }

    public static int stringmode() {
        int score = 0;
        String yesNo = " ";
        String alreadyAnswered = " ";
        System.out.println(allWORD);


        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Guess a word that has to do with the beach! Capitalize the first letter.");
            String Answer = in.nextLine();

            if (allWORD.contains(Answer) && !alreadyAnswered.contains(Answer)) {
                alreadyAnswered = alreadyAnswered + Answer;
                score++;
                System.out.println("You Guessed Correctly! Your Score is now: " + score + "\nPlay again? 'yes'/'no'");
                Scanner yN = new Scanner(System.in);
                yesNo = yN.next();
            } else {
                System.out.println("You Guessed Incorrectly, play words again? 'yes'/'no'");
                Scanner yN = new Scanner(System.in);
                yesNo = yN.next();
            }
        } while (yesNo.contains("y"));
        return score;
    }

    public static void initialize() throws FileNotFoundException {

        File file = new File("/Users/emma/IdeaProjects/summer2020/src/com/company/file.txt");
        Scanner read = new Scanner(file);

        String trash = " ";

        double[] allDouble = new double[20];
        for (int i = 0; i < allDouble.length; i++) {
            while (read.hasNextLine()) {
                if (read.hasNextDouble()) {
                    allDouble[i] = read.nextDouble();
                } else {
                    trash = read.next();
                }
                allDOUBLE = Arrays.toString(allDouble);
            }
        }

        int[] allInt = new int[29];
        for (int i = 0; i < allInt.length; i++) {
            while (read.hasNextLine()) {
                if (read.hasNextInt()) {
                    allInt[i] = read.nextInt();
                } else {
                    trash = read.next();
                }
                allINT = Arrays.toString(allInt);
            }
        }

        String[] allWord = new String[25];
        for (int i = 0; i < allWord.length; i++) {
            while (read.hasNextLine()) {
                if (read.hasNext()) {
                    allWord[i] = read.next();
                } else {
                    trash = read.next();
                }
                allWORD = Arrays.toString(allWord);
            }
        }
    }
}

