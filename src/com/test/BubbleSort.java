package com.test;

public class BubbleSort {
    public static void main(String args[])
    {
        int[] a ={40,6,1,4,90,3,70,85,4,800,0,3,44,65,2};
        bubbleSort(a);


        for(int n : a)
            System.out.print(n + " ");

    }

    static void bubbleSort(int[] a){

        int n = a.length;

        for(int i=0; i<n-1; i++)
            for(int j=0 ; j<n-i-1; j++)
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
    }


}
