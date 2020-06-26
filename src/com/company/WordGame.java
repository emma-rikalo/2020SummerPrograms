package com.company;

import java.util.*;
import java.io.*;

//make one array,

public class WordGame {
//    public static String allINT = " ";
//    public static String allDOUBLE = " ";
    public static String allWORD = " ";
    public static int SCORE1;
    public static int SCORE2;
    public static int SCORE3;


    public static void main(String[] args) throws FileNotFoundException{
        String replay ="";
        System.out.println("* WELCOME! *");

        do {

            Scanner input = new Scanner(System.in);
            System.out.println("Would you like to play with 'Integers', 'Doubles', or 'Words'?");
            String Mode = input.next();

//            initializeint();
//            initializedou();
            initializestr();


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
            Scanner again = new Scanner(System.in);
            System.out.println("\nDo you want to play again in a different mode? 'yes'/'no'");
            replay = again.nextLine();
        } while (replay.contains("y"));
        System.out.println("Your Final Score is: "+(SCORE1+SCORE2+SCORE3));

    }

    public static int intmode() {
        String yesNo;
        int score = 0;
        String alreadyAnswered = "";

       do {
            Scanner in = new Scanner(System.in);
            System.out.println("Guess an integer 0-300");
            int answer = in.nextInt();
            String Answer = Integer.toString(answer);

            if (allWORD.contains(Answer) && !alreadyAnswered.contains(Answer)) {
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

        do {

            Scanner in = new Scanner(System.in);
            System.out.println("Guess a double rounded to the tenths place 0-15");
            double answer = in.nextDouble();
            String Answer = Double.toString(answer);

            if (allWORD.contains(Answer) && !alreadyAnswered.contains(Answer)) {
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

//    public static void initializeint() throws FileNotFoundException {
//
//        File file = new File("/Users/emma/IdeaProjects/summer2020/src/com/company/file.txt");
//        Scanner read = new Scanner(file);
//        int i=0;
//        String trash = " ";
//
//        int [] allInt = new int[134];
//            i=0;
//        while (read.hasNextLine()) {
//            if (read.hasNextInt()) {
//                i++;
//                allInt[i] = read.nextInt();
//            } else {
//                trash = read.next();
//            }
//            allINT = Arrays.toString(allInt);
//        }
//
//    }
//    public static void initializedou() throws FileNotFoundException {
//        File file = new File("/Users/emma/IdeaProjects/summer2020/src/com/company/file.txt");
//        Scanner read = new Scanner(file);
//        int i=0;
//        String trash = " ";
//
//        double[] allDouble = new double[134];
//        while (read.hasNextLine()) {
//            if (read.hasNextDouble()) {
//                i++;
//                allDouble[i] = read.nextDouble();
//            } else {
//                trash = read.next();
//            }
//            allDOUBLE = Arrays.toString(allDouble);
//        }
//    }

    public static void initializestr() throws FileNotFoundException {
        File file = new File("/Users/emma/IdeaProjects/summer2020/src/com/company/file.txt");
        Scanner read = new Scanner(file);
        int i=0;
        String trash = " ";

        String [] allWord = new String[134];
        i=0;
        while (read.hasNextLine()) {
            if (read.hasNext()) {
                i++;
                allWord[i] = read.next();
            } else {
                trash = read.next();
            }
            allWORD = Arrays.toString(allWord);
        }

    }
}

