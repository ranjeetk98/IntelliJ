package com.test;

import java.util.Arrays;

public class FindMissingElement {

    public static void main(String[] args){

        int[] arr = {1,5,2,4};

        System.out.println("Missing element is : "+findMissingElement(arr));
        System.out.println("Missing element is : "+findMissingElement2(arr));
    }

//    Method 1 :
    public static int findMissingElement(int[] arr){

        int n = arr.length+1;
        int sum = (n*(n+1))/2;
        int arraySum = 0;
        for(int num : arr){
            arraySum +=num;
        }
        return sum-arraySum;
    }

    //    Method 2:
    public static int findMissingElement2(int[] arr){
        Arrays.sort(arr);

        for(int i=0,n=1;i<arr.length;i++,n++){
             if(arr[i]!=n)
                return n;

        }

        return -1;

    }


}
