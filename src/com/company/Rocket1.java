package com.company;

public class Rocket1 {

    public static void main(String[] args) {
	     Top();
        TopBox();
        System.out.println("+------+");
        System.out.println("|United|");
        System.out.println("|States|");
        System.out.println("+------+");
        BottomBox();
        Top();
    }
    public static void Top(){
        System.out.println ("   /\\ ");
        System.out.println ("  /  \\");
        System.out.println(" /    \\");
    }
    public static void TopBox(){
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
    }
    public static void BottomBox(){
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
    }
}
