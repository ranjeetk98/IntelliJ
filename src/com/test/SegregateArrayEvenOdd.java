package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SegregateArrayEvenOdd {

    public static void main(String[] args){

        int[] arr = {33,4,71,55,48,8};
//        List<Integer> ls = Arrays.asList(33,4,71,55,48,8);
        segregate(arr);

        segregate2(arr);
    }

    public static void segregate(int[] arr){

        List<Integer> result = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 0)
                result.add(num);
        }

        for (int num : arr) {
            if (num % 2 != 0)
                result.add(num);
        }

        System.out.println(result);

    }

    public static void segregate2(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // Move left pointer if element is even
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }

            // Move right pointer if element is odd
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }

            // Swap
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        // Print result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
