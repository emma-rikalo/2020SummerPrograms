package com.company;
//This program will give a total
//06/08/20
//Emma Rikalo

public class modifycode {

    // calculate total owed, assuming 8% tax & 15% tip
    public static void main(String[] args) {

        //create a 2 constants
        final double TAXRATE= 0.08;
        final double TIP= .15;

        //declare the subtotal
        int subtotal= (38+40+30);

        //declare all other variables based on the subtotal
        double tax= ((subtotal) * TAXRATE);
        double tip=((subtotal) * TIP);
        double total=(subtotal + tax + tip);

        //print all information
        System.out.println("Subtotal:" + subtotal);
        System.out.println("Tax:" + tax);
        System.out.println("Tip:" + tip);
        System.out.println("Total:" +total);
    }
}

