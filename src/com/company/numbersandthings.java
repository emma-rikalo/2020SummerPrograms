package com.company;

import java.util.*;

public class numbersandthings {

    public static void main(String[] args) {


        double doubly1= 2.4;
        double doubly2= 8 ;
        double doubly3= 5.1;
        double doubly4= Math.random()*100;
        double doubly5= Math.sqrt(doubly3*doubly1);
        double doubly6= Math.pow(doubly3, doubly2);
        double doubly7= Math.sin(doubly1);


        System.out.printf("These are my calculations: \n %20.0f \n %20.3f \n %20.3f \n %20.3f", doubly4, doubly5, doubly6, doubly7);
    }

}

