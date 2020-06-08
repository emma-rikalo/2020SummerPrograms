package com.company;

public class C2 {

    public static void main(String[] args) {
        Line();
        Up();
        Down();
        Line();
        Down();
        Up();
        Line();
    }
    public static void Line(){
        System.out.println("+---------+");
    }
    public static void Up(){

        System.out.println ("|    *    |");
        System.out.println ("|   /*\\   |");
        System.out.println ("|  //*\\\\  |");
        System.out.println ("| ///*\\\\\\ |");
    }
    public static void Down(){

        System.out.println("| \\\\\\*/// |");
        System.out.println("|  \\\\*//  |");
        System.out.println("|   \\*/   |");
        System.out.println("|    *    |");
    }
}

