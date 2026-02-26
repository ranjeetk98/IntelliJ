package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArray {

    public static void main(String[] args){

        //Sort array in ascending order
        int[] arr = {43,7,1,99,34,66,100,23};
        Arrays.sort(arr);
        System.out.println("Array in ascending order :");
        for(int a : arr){
            System.out.print(a + " ");
        }


        //Sort array in decending order
        Integer[] arr2 = new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            arr2[i] = arr[i];
        }

        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println("\nArray in decending order :");
        for(int a : arr2){
            System.out.print(a + " ");
        }


    }
}
