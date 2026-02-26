package com.test;


// java program to print prime number from 1 to k

public class PrimeNumber {

    public static void main(String[] args) {
        int k = 100;
        printPrimeNumber(k);
    }

    public static void printPrimeNumber(int k) {

        for(int num=2; num<=k; num++){
            boolean isPrime = true;
            for( int divisor=2; divisor <= num/2 ; divisor++)
                if(num%divisor==0)
                    isPrime = false;

            if(isPrime)
                System.out.print(num + " ");
        }
    }

}
