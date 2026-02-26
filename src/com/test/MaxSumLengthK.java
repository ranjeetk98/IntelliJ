package com.test;

//Here is a Java program to find the maximum sum of a contiguous subarray of a fixed length k
// using the efficient sliding window technique. This approach has a time complexity of O(N).

public class MaxSumLengthK {

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println("Maximum sum: " + maxSum(arr, k));
        System.out.println("Maximum sum: " + findMaxSumSubArray(arr, k));
    }


    public static int maxSum(int[] arr, int k) {

        if (arr.length < k) {
            return 0;
        }

        int windowSum = 0;

        // Step 1: First window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Step 2: Slide the window
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static int findMaxSumSubArray(int[] arr, int k) {
        if (arr == null || k <= 0 || k > arr.length) {
            System.out.println("Invalid input: Array is null, k is invalid, or k is larger than array length.");
            return 0;
        }

        int windowSum = 0;
        int maxSum = 0;
        int left = 0;

        // Slide the window across the array
        for (int right = 0; right < arr.length; right++) {

            // Add the next element to the window sum
            windowSum += arr[right];

            // Once we hit the window size of k, we can check the sum and slide
            if (right >= k - 1) {
                // Update maxSum if the current windowSum is greater
                maxSum = Math.max(maxSum, windowSum);

                // Subtract the element going out of the window
                windowSum -= arr[left];

                // Slide the window ahead (increment the start pointer)
                left++;
            }
        }

        return maxSum;
    }


}