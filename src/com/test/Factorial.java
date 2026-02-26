package com.test;


import java.util.Scanner;

public class Factorial {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = s.nextInt();

        System.out.println("Factorial : "+ factorial(n));
    }

    public static long factorial(long n){
        if(n == 1 )
            return 1;
        else
            return n*factorial(n-1);

    }

}
