package com.test;

// Program to display a list in which each element is sum of all other elements except
// corresponding element of input list

public class SumOfAllElements {

    public static void main(String[] args){
        int[] a = {4,8,1,7,3,0};
        int[] b = new int[a.length];


        int sum = sumOfAllElements(a);

        for(int i=0; i<a.length; i++){
            b[i] = sum - a[i];
        }


        for(int i=0; i<b.length; i++)
            System.out.print(b[i]+" ");
    }

    public static int sumOfAllElements(int[] a){
        int sum=0;
        for(int i=0; i<a.length; i++)
            sum = sum+a[i];

        return sum;
    }

}
