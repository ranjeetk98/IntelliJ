package com.test;

import java.util.Scanner;

class CheckPalindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = scanner.nextLine();

        checkStringPalindrome(s);

    }

    public static void checkStringPalindrome(String s) {

        s = s.toLowerCase().replaceAll(" ", "");

        int i, j;
        for (i = 0, j = s.length() - 1; i < j; i++, j--) {

            if (s.charAt(i) != s.charAt(j))
                break;

        }

        if (i<j)
            System.out.println("Not Palindrome");
        else
            System.out.println("Palindrome");
    }
}