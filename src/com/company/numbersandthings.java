package com.company;

public class numbersandthings {

    public static void main(String[] args) {
        double doubly1= 2.4;
        double doubly2= 8 ;
        double doubly3= 5.1;
        double doubly4= doubly1*doubly2 ;
        double doubly5= Math.sqrt(doubly3);
        double doubly6= Math.pow(doubly3, doubly2);

        System.out.printf("These are my calculations: \n %20.3f \n %20.3f \n %20.3f", doubly4, doubly5, doubly6);
    }

}

