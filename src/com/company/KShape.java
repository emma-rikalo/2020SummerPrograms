package com.company;
//This program will create a K shape using letters
//06/09/20
//Emma Rikalo

public class KShape {

// Declare global variable SIZE which allows the maximum # of letters to be chosen
    public static final int SIZE=5;

//Declare global character LETTER to choose where the pattern will start, in this case A
    public static final char LETTER = 65;

//print both parts of the K
    public static void main(String[] args) {
        Top();
        Bottom();
    }

    //create a method for the top of the K
    public static void Top (){

        //create a loop so that the code will repeat the correct number of times
        for (byte loop=SIZE; loop>=0; loop--) {
                //declare the byte count that will print the desired number of letters
                for (byte count = 0; count <= loop; count++) {
                    System.out.print((char) (LETTER + count) + " ");
                }
                System.out.println("");
        }
    }

    //create a method for the bottom of the K
    public static void Bottom () {

        //create a loop so that the code will repeat the correct number of times, this time starting at 1 letter and growing
        for (byte loop=0; loop<=SIZE; loop++) {
            //declare the byte count that will print the desired number of letters
            for (byte count =0; count <= loop; count++) {
                System.out.print((char) (LETTER + count) + " ");
            }
            System.out.println("");

        }
    }
}

