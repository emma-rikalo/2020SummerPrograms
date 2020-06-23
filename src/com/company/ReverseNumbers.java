package com.company;

import java.util.*;
public class ReverseNumbers {
    public static void main (String[] args){
        int [] numbers = {30,4,9,23,65,12,87,1}; //another way to create arrays
        numbers=reverse(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static int[] reverse(int [] num){ //reverses the order of the array
        for(int i=0; i<num.length; i++){
            int temp= num[i];
            num[i]=num[num.length-1-i];
            num[num.length-1-i]=temp;
        }
        return num;
    }

}
