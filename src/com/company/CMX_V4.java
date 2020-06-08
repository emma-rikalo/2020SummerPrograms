package com.company;
//This program will print a resizable mirror
//THIS IS VERSION 4
//06/5/20
//Emma Rikalo

public class CMX_V4 {

    public static final int SIZE= 4; // Declaring a global constant

    public static void main(String[] args) {
        Line();
        Top();
        Bottom();
        Line();
    }

    public static void Line(){
        System.out.print("#");
        for(int eq=0; eq<4*SIZE; eq++){
            System.out.print("=");
        }
        System.out.println("#");
    }

    public static void Top(){

        for (int line=1; line<SIZE+1; line++){

            System.out.print("|");
            for(int space=1; space<=-2*line+SIZE*2; space++){
                System.out.print(" ");
            }
            System.out.print("<>");
            for(int dot=0; dot<4*line-SIZE; dot++){
                System.out.print(".");
            }
            System.out.print("<>");
            for(int space=1; space<=-2*line+SIZE*2; space++){
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void Bottom(){
        for (int line=1; line<SIZE+1; line++){

            System.out.print("|");
            for(int space=1; space<=2*line-SIZE/2; space++){
                System.out.print(" ");
            }
            System.out.print("<>");
            for(int dot=0; dot<-4*line+SIZE*4; dot++){
                System.out.print(".");
            }
            System.out.print("<>");
            for(int space=1; space<=2*line-SIZE/2; space++){
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}

