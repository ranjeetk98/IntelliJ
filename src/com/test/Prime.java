package com.test;

import java.util.*;

public class Prime {

    public static void main(String[] args){

        int n =100;

        for (int num = 2; num <= n; num++) {

            boolean isPrime = true;

            for (int i = 2; i * i <= num; i++)
                if (num % i == 0)
                 {
                    isPrime = false;
                    break;
                 }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }


    }
}
