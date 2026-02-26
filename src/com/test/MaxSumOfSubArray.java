package com.test;

public class MaxSumOfSubArray {
    public static void main(String[] args)
    {
        int[] a = {2,3,-8,7,-1,2,3};
        int n= a.length;
        int maxSum=0, sum=0;

        for(int i=0; i<n ;i++){
            for(int end=i; end<n ;end++){
                sum=0;
                for(int k=i; k<=end ;k++){
                   sum+=a[k];
                }
            }
            if(maxSum<sum)
                maxSum=sum;
        }

        System.out.println("MaxSum = "+maxSum);
    }
}
