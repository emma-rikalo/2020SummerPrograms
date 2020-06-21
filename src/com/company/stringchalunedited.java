package com.company;

import java.util.*;

public class stringchalunedited {

    public static String even = "";
    public static String odd= "";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phrase: ");
        String phrase = input.nextLine();


        for(int index=0; index<phrase.length(); index+=2){
            even = even + phrase.charAt(index);
        }
        for(int index=1; index<phrase.length(); index+=2){
            odd= odd + phrase.charAt(index);
        }

        String answer= even + "  " + odd;
        System.out.println(answer);
    }
}
