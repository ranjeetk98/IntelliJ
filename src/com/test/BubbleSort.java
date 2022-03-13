package com.test;

public class BubbleSort {
    public static void main(String args[])
    {
        int[] a ={3434,6,1,4,995,3,774,85,4,888,0,3,44,65,2};
        bubbleSort(a);


        for(int i=0 ; i<a.length; i++)
            System.out.print(a[i] + " ");

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
