package com.company;

public class Complxv2 {

    public static void main(String[] args) {
	    int size=4;
	     Line(size);
	     Top(size);
	     Bottom(size);
	     Line(size);
    }

    public static void Line(int size){

        if(size<0) {
            //checking for input parameter validity, only valid from 0 to 32
            System.out.println ("invalid size parameter");
        }
        else {
            System.out.print("#");
            for (int eq=0; eq<size; eq++) {
                System.out.print("====");
            }
            System.out.println("#");
        }
    }
    public static void Arrow(int NmbSlashes, int MaxSize) {
        System.out.print("|");
        for(int i = 0; i<MaxSize-NmbSlashes-1; i++){
            System.out.print("  ");
        }

        System.out.print("<>");
        for (int i =0; i<NmbSlashes; i++){
            System.out.print("....");
        }
        System.out.print("<>");
        for(int i = 0; i<MaxSize-NmbSlashes-1; i++){
            System.out.print("  ");
        }
        System.out.print("|");
    }


    public static void Top(int size) {

        if (size < 0) {
            //checking for input parameter validity, only valid from 0 to 10
            System.out.println("invalid size parameter");
        }
        else {
            for(int i=0; i<size; i++) {
                Arrow(i,size);
                System.out.println();
            }

        }
    }

    public static void Bottom(int size){
        if (size < 0) {
            //checking for input parameter validity, only valid from 0 to 10
            System.out.println("invalid size parameter");
        }
        else {
            for (int i = size-1; i >= 0; i--) {
                Arrow(i,size);
                System.out.println();
            }
        }
    }
}
