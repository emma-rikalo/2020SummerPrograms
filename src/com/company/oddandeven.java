package com.company;

public class oddandeven {

    public static void main(String[] args) {

        //create the variable even to print all even numbers 0-100
        for (int even=0;even<=100; even+=2){
            System.out.print (even + " ");

        }

        //add a line break between the two sets of numbers
        System.out.println(" ");

        //create the variable odd to print all odd numbers 0-100
        for (int odd=1; odd<=100; odd+=2) {
            System.out.print(odd + " ");
        }

    }

}

