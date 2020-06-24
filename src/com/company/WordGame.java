package com.company;

import java.util.*;
import java.io.*;

public class WordGame {
    public static void main(String[] args) throws FileNotFoundException {
        String allINT;
        String allDOUBLE;
        String allWORD;

        File file= new File("/Users/emma/IdeaProjects/summer2020/src/com/company/file.txt");
        Scanner read= new Scanner (file);
        if(read.hasNextInt()){
            int[] allInt = new int [50];
            allInt[50]=read.nextInt();
            allINT=Arrays.toString(allInt);/
        }
        else if(read.hasNextDouble()){
            double [] allDouble = new double [20];
            allDouble[20]=read.nextDouble();
            allDOUBLE =Arrays.toString(allDouble);
        }
        else if(read.hasNextLine()){
            String [] allWord = new String [25];
            allWord[25]=read.nextLine();
            allWORD= Arrays.toString(allWord);
        }

        Scanner input= new Scanner (System.in);
        System.out.println("Would you like to play with 'Int', 'Double', or 'String'?");
        String Mode= input.next();

        if(Mode.contains("Int")){
            intmode(allINT);
            System.out.println("Your Final Score is: " + score);
        }
        else if(Mode.contains("Double")){
            doublemode(allDOUBLE);
            System.out.println("Your Final Score is: " + score);
        }
        else if(Mode.contains("String")){
            stringmode(allWORD);
            System.out.println("Your Final Score is: " + score);
        }


    }

    //NEED TO ADD PROMTS FOR INPUT/ OPTION TO REPLAY WHEN YOU WIN INTO ALL METHODS (do same y/n for both?)

    public static String intmode(String allINT){
        do {
            String alreadyAnswered = "";
            int score = 0;

            Scanner in = new Scanner(System.in);
            System.out.println("Guess an integer 0-50");
            int answer = in.nextInt();
            String Answer = Integer.toString(answer);

            if (allINT.contains(Answer) && !alreadyAnswered.contains(Answer)) {
                alreadyAnswered = alreadyAnswered + Answer;
                score++;
            } else {
                System.out.println("You Guessed Incorrectly, play again? 'yes'/'no'");
                Scanner yN = new Scanner(System.in);
                String yesNo = yN.next();
            }

        }while (yesNo.contains("y")); //Ask
        return score;
    }

    public static String doublemode(String allDOUBLE){
        do {
            String alreadyAnswered = "";
            int score = 0;

            Scanner in = new Scanner(System.in);
            double answer = in.nextDouble();
            String Answer = Double.toString(answer);

            if (allDOUBLE.contains(Answer) && !alreadyAnswered.contains(Answer)) {
                alreadyAnswered = alreadyAnswered + Answer;
                score++;
            } else {
                System.out.println("You Guessed Incorrectly, play again? 'yes'/'no'");
                Scanner yN = new Scanner(System.in);
                String yesNo = yN.next();
            }

        }while (yesNo.contains("y")); //Ask
        return score;
    }

    public static String stringmode(String allWORD){
        do {
            String alreadyAnswered = "";
            int score = 0;

            Scanner in = new Scanner(System.in);
            String Answer = in.nextLine();

            if (allWORD.contains(Answer) && !alreadyAnswered.contains(Answer)) {
                alreadyAnswered = alreadyAnswered + Answer;
                score++;
            } else {
                System.out.println("You Guessed Incorrectly, play again? 'yes'/'no'");
                Scanner yN = new Scanner(System.in);
                String yesNo = yN.next();
            }

        }while (yesNo.contains("y")); //Ask
        return score;
    }
}
