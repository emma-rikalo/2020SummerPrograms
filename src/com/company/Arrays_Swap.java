package com.company;
/*Emma Rikalo
  06/23/20

pseudocode:
create random obj
declare int var size= random # 5-10
declare array
create for loop w/size to create each element
set array equal to size # of random ints 0-100
declare 2 int for the indexes
make sure indexes are never equal
do{
indx1=rand.nextInt(array.length);
indx2=rand.nextInt(array.length);
}while (indx1==indx2)
call the swap method (array, indx1, indx2)

swap method-
public static int[] swap (int[], int i, int j)
swap the values of the two numbers corresponding to the indexes chosen
return array
 */



import java.util.*;
public class Arrays_Swap {
    public static void main(String[] args) {
        Random randy = new Random();
        int size = randy.nextInt(5) + 5;

        int[] a1 = new int[size];

        for (int i = 0; i < size; i++) {
            a1 [i] = randy.nextInt(100);
        }

        System.out.println("Your numbers:");
        System.out.println(Arrays.toString(a1)+"\n");

        int index1;
        int index2;

        do {
            index1= randy.nextInt(a1.length);
            index2 = randy.nextInt(a1.length);
        }while(index1==index2);

        swap(a1, index1, index2);
        System.out.println("Your swapped numbers:");
        System.out.println(Arrays.toString(a1));
    }

    public static int[] swap (int[] a1, int i, int j) {
            int temp = a1[i];
            a1[i] = a1[j];
            a1[j] = temp;
            return a1;
    }
}
