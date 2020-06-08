package com.company;

//This program will print a mirror (this is the third version)
//06/04/20
// Emma Rikalo

public class CMP_FigureV3 {

    public static void main(String[] args) {
        int size=4;
        Line(size);
        Top(size);
        Bottom(size);
        Line(size);
    }

    public static void Line(int size){

            System.out.print("#");
            for (int eq=0; eq<size; eq++) {
                System.out.print("====");
            }
            System.out.println("#");
        }

    public static void Arrow(int arr, int eq) {
        System.out.print("|");
        for(int i = 0; i<eq-arr-1; i++){
            System.out.print("  ");
        }

        System.out.print("<>");

        for (int i =0; i<arr; i++){
            System.out.print("....");
        }

        System.out.print("<>");

        for(int i = 0; i<eq-arr-1; i++){
            System.out.print("  ");
        }

        System.out.print("|");
    }


    public static void Top(int size) {

            for(int i=0; i<size; i++) {
                Arrow(i,size);
                System.out.println();
            }
        }

    public static void Bottom(int size){

        for(int i= size-1; i>=0; i--) {
            Arrow(i,size);
            System.out.println();
        }
    }
}


