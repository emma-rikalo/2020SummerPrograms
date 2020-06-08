package com.company;
//This program will create a resizable image of diamonds
//06/06/20
//Emma Rikalo

public class Challenge2 {
//Declare the global variable size so that the image will be easily resizable
public static final int size=4;

//call all parts of the image
    public static void main(String[] args) {
        Line();
        Up();
        Down();
        Line();
        Down();
        Up();
        Line();
    }

//create a method for the line in the image w/ a for loop to make the code more efficient
    public static void Line(){
            System.out.print("+");
            for (int dash =0; dash<size; dash++) {
                System.out.print("--");
            }
            System.out.println("-+");
        }

        //create a method for the pattern that makes up the top part of the diamond
    public static void StarSlash(int NmbSlashes, int MaxSize) {
        System.out.print("|");
        for(int space = 0; space<MaxSize-NmbSlashes; space++){
            System.out.print(" ");
        }
        for (int slash =0; slash<NmbSlashes; slash++){
            System.out.print("/");
        }
        System.out.print("*");
        for (int backslash =0; backslash<NmbSlashes; backslash++){
            System.out.print("\\");
        }
        for(int space = 0; space<MaxSize-NmbSlashes; space++){
            System.out.print(" ");
        }
        System.out.print("|");
    }

       //create a method for the pattern that makes up the bottom part of the diamond
    public static void InverseStarSlash(int NmbSlashes, int MaxSize) {
        System.out.print("|");
        for(int space = 0; space<MaxSize-NmbSlashes; space++){
            System.out.print(" ");
        }
        for (int backslash =0; backslash<NmbSlashes; backslash++){
            System.out.print("\\");
        }
        System.out.print("*");
        for (int slash =0; slash<NmbSlashes; slash++){
            System.out.print("/");
        }
        for(int space = 0; space<MaxSize-NmbSlashes; space++){
            System.out.print(" ");
        }
        System.out.print("|");
    }

     //create a method for the top part of the diamond that calls the pattern & allows it to be resizable
    public static void Up() {
            for(int i=0; i<size; i++) {
                StarSlash(i,size);
                System.out.println();
            }
    }

    //create a method for the bottom part of the diamond that calls the pattern & allows it to be resizable
    public static void Down(){
            for (int i = size-1; i >= 0; i--) {
                InverseStarSlash(i,size);
                System.out.println();
            }
    }
}
