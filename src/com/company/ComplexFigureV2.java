package com.company;

//This program will print a mirror (this is the second version)
//06/04/20
// Emma Rikalo

public class ComplexFigureV2 {

    public static void main(String[] args) {
       Line();
       Top();
       Bottom();
       Line();
    }

    public static void Line(){
        System.out.print("#");

        //declare variable/ control value / increment
        for(int dash=0; dash<16; dash++){
            System.out.print("=");
        }
        System.out.println("#");


    }

    public static void Top(){

        //LINE 1

        System.out.print("|");
        for (int space=0; space<6; space++ ){
            System.out.print(" ");
        }
        System.out.print("<>");
        for (int dot=0; dot>0; dot++ ){
            System.out.print(".");
        }
        System.out.print("<>");
        for (int space=0; space<6; space++ ){
            System.out.print(" ");
        }
        System.out.println("|");

        // LINE 2

        System.out.print("|");
        for (int space=0; space<4; space++ ){
            System.out.print(" ");
        }
        System.out.print("<>");
        for (int dot=0; dot<4; dot++ ){
            System.out.print(".");
        }
        System.out.print("<>");
        for (int space=0; space<4; space++ ){
            System.out.print(" ");
        }
        System.out.println("|");

        //LINE 3

        System.out.print("|");
        for (int space=0; space<2; space++ ){
            System.out.print(" ");
        }
        System.out.print("<>");
        for (int dot=0; dot<8; dot++ ){
            System.out.print(".");
        }
        System.out.print("<>");
        for (int space=0; space<2; space++ ){
            System.out.print(" ");
        }
        System.out.println("|");

        //LINE 4

        System.out.print("|");
        for (int space=0; space>0; space++ ){
            System.out.print(" ");
        }
        System.out.print("<>");
        for (int dot=0; dot<12; dot++ ){
            System.out.print(".");
        }
        System.out.print("<>");
        for (int space=0; space>0; space++ ){
            System.out.print(" ");
        }
        System.out.println("|");


    }
//
    public static void Bottom(){
        //LINE 1

        System.out.print("|");
        for (int space=0; space>0; space++ ){
            System.out.print(" ");
        }
        System.out.print("<>");
        for (int dot=0; dot<12; dot++ ){
            System.out.print(".");
        }
        System.out.print("<>");
        for (int space=0; space>0; space++ ){
            System.out.print(" ");
        }
        System.out.println("|");

        //LINE 2

        System.out.print("|");
        for (int space=0; space<2; space++ ){
            System.out.print(" ");
        }
        System.out.print("<>");
        for (int dot=0; dot<8; dot++ ){
            System.out.print(".");
        }
        System.out.print("<>");
        for (int space=0; space<2; space++ ){
            System.out.print(" ");
        }
        System.out.println("|");

        //LINE 3
        System.out.print("|");
        for (int space=0; space<4; space++ ){
            System.out.print(" ");
        }
        System.out.print("<>");
        for (int dot=0; dot<4; dot++ ){
            System.out.print(".");
        }
        System.out.print("<>");
        for (int space=0; space<4; space++ ){
            System.out.print(" ");
        }
        System.out.println("|");

        //LINE 4
        System.out.print("|");
        for (int space=0; space<6; space++ ){
            System.out.print(" ");
        }
        System.out.print("<>");
        for (int dot=0; dot>0; dot++ ){
            System.out.print(".");
        }
        System.out.print("<>");
        for (int space=0; space<6; space++ ){
            System.out.print(" ");
        }
        System.out.println("|");
    }


}

