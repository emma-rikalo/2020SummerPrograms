package com.company;
//Emma Rikalo
//06/21/20

//Pseudocode:
//Create a scanner
//Declare an Int T to be equal to the input number of test cases (words)
//1<=T<=10
//Create T number of Strings equal to the words in the phrase
//strings must have 2<=length<=10000
//Create substrings/new strings for odd/even indexed chars in each phrase
//If a char’s index is odd/even add it to the specified string
//Declare a String =even indexed chars + “  “ + odd indexed chars
//Return the answer
//Print this string
//Repeat for the rest of the words

//import needed java classes
import java.util.*;


public class String_Challenge {

    public static void main(String[] args) {
      //create int T to represent the # of words that need to be reordered
      int T;
      //create a scanner to receive user input for T
      Scanner input = new Scanner(System.in);
      //prompt the user/ set T equal to their input
        boolean correctinput = false;
        do {
            System.out.println("Enter an integer 1-10");
            T = input.nextInt();
            //check if T fits the requirements
            if (T < 1 || T > 10) {
                System.out.println("T must be an integer 1-10");
            } else {
                correctinput = true;
            }
        } while (!correctinput) ;


        //ask user to input their words
        System.out.println("Enter " + T + " word(s), one per line: ");

        //create string S to receive what will be the output
        String S = "";

        //create a counter to loop the program for each word
        for (int counter = 0; counter < T; counter++) {
            //create a string equal to the reordered word
            String s1 = word();

            //put together the list of reordered words
            S = S + s1 + "\r\n";
        }

        //print the list of reordered words
        System.out.println(" ");
        System.out.println(S);
    }



    //create a method to break the words into even/odd indexed chars
    public static String word(){

        //create strings even and odd to contain the even/odd characters
        String even= "";
        String odd="";

        //receive input for the words
        Scanner input=new Scanner(System.in);
        String w= input.next();

        //check the words meet the length requirement
       if(2>=w.length() || w.length()>=10000){
            boolean correctinput = false;
            do {
                System.out.println("Enter a word with 2-10000 characters");
                w=input.next();
                 if(2<=w.length() && w.length()<=10000) {
                    correctinput = true;
                }
            } while (!correctinput) ;
        }

        //count all even chars and add them to string even
        for(int index=0; index<w.length(); index+=2){
            even = even + w.charAt(index);
        }
        //count all odd chars and add them to string odd
        for(int index=1; index<w.length(); index+=2){
            odd= odd + w.charAt(index);
        }

        //create string answer equal to the even + the odd chars
        String answer= even + "  " + odd;
        //return string answer
        return answer;
    }

}
