package com.test;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        System.out.println("Enter two strings : ");
        String s1 = inputString();
        String s2 = inputString();

        if(charCount(s1).equals(charCount(s2)))
            System.out.println("'"+s1+"'" + " is ANAGRAM of "+ "'"+s2 +"'");
        else
            System.out.println("Not-Anagram");
    }
    public static String inputString(){
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    public static HashMap<Character,Integer> charCount(String s){
        char[] ch = s.toUpperCase().replaceAll(" ","").toCharArray();
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(char c : ch)
            if(hm.containsKey(c))
                hm.put(c,hm.get(c)+1);
            else
                hm.put(c,1);
        return hm;
    }


}
