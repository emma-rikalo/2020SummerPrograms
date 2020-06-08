package com.company;

//This program will print a mirror
//06/03/20
// Emma Rikalo

public class Complex {

    public static void main(String[] args) {
       Line();
       Top();
       Bottom();
       Line();
    }

    public static void Line(){
        System.out.println("#================#");

    }

    public static void Top(){
        System.out.println("|      <><>      |");
        System.out.println("|    <>....<>    |");
        System.out.println("|  <>........<>  |");
        System.out.println("|<>............<>|");

    }

    public static void Bottom(){
        System.out.println("|<>............<>|");
        System.out.println("|  <>........<>  |");
        System.out.println("|    <>....<>    |");
        System.out.println("|      <><>      |");


    }


}

