package com.test;

import java.util.*;

public class CanFormPalindrome {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it can form palindrome : ");
        String s = scanner.nextLine();

        if(canFormPalindrom(s))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static Boolean canFormPalindrom(String s) {
        char[] ch = s.toLowerCase().replaceAll(" ", "").toCharArray();

        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(char c : ch){
            if(hm.containsKey(c))
                hm.put(c,hm.get(c)+1);
            else
                hm.put(c,1);
            }

        int odd =0;

        for(Map.Entry<Character,Integer> e : hm.entrySet()){
            if(e.getValue() % 2 == 1)
                odd++;
        }

        if(odd>1)
            return false;
        else
            return true;

    }
}

