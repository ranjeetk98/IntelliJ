package com.test;


public class SelectionSort {


    public static void main(String args[]){
        int[] a ={40,6,1,4,90,3,70,85,4,800,0,3,44,65,2};

        selectionSort(a);

        for(int n : a)
            System.out.print(n+" ");


    }

    public static void selectionSort(int[] a){

        for(int i=0; i<a.length-1; i++){
            int min = i;
            for(int j=i+1; j< a.length; j++){
                if(a[j]<a[min])
                    min = j;
            }
            int temp= a[i];
            a[i]=a[min];
            a[min]=temp;

        }


    }


}
