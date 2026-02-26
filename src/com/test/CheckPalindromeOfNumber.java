package com.test;


import java.math.BigInteger;


class CheckPalindromeOfNumber {

    public static void main(String[] args) {

       int num = 2235322;
       String str = String.valueOf(num);
        checkStringPalindrome(str);
        checkPalindrome(num);

    }

    public static void checkStringPalindrome(String str) {


        int i,j;
        for(i=0,j=str.length()-1;i<j; i++,j-- ){
            if(str.charAt(i)!=str.charAt(j))
                break;
        }


        if (i<j)
            System.out.println("Not Palindrome");
        else
            System.out.println("Palindrome");
    }

    public static void checkPalindrome(int n){
        int temp = n;
        int reverse = 0;

        while(temp > 0){
            reverse = (reverse*10)+ (temp%10);
            temp /=10;
        }

        if(reverse == n)
            System.out.println("Palindrome");
        else
            System.out.println("NOT Palindrome");
    }
}