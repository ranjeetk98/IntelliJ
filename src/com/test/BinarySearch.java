package com.test;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args)
    {
        int[] a = {1,3,7,8,13,19,23,45,46,47,52,58,74,81,90,100};
        System.out.print("Enter a number to search : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = binarySearch(a,n);
        if(i > 0 )
            System.out.println(n + " is present at index number "+ i);
        else
            System.out.println(n+ " is not-present in the array");

    }

    static int binarySearch(int[] a , int key){

        int mid=0, low =0, high=a.length-1;

        while(low<=high){
            mid = (low+high)/2 ;

            if(a[mid] == key)
                return mid;

            if(a[mid]>key)
                high = mid -1;
            else
                low = mid+1;

        }

       return -1;
    }
}
