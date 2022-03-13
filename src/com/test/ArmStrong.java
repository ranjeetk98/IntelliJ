package com.test;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args){

        System.out.print("Enter a number to check if its Armstrong number or not : ");
        //153, 1634, 8208, 9474, 54748, 92727, 93084
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if(checkAngstrom(n))
            System.out.println("Armstrong");
        else
            System.out.println("Not-Armstrong");

    }

    public static Boolean checkAngstrom(int n) {

        //convert number to string and then get its length
        int order = String.valueOf(n).length();

        int result =0;

        for(int temp = n; temp>0 ; temp /= 10)
            result += power(temp%10, order);


        if(result == n)
            return true;
        else
            return false;
    }

    public static int power(int n,int order){
        if(order==1)
            return n;
        else
            return n*power(n,order-1);
    }

}
