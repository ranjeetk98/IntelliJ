package com.test;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {

       String str = "testing is fun";
       charCount(str);

    }

        public static void charCount(String str) {

            char[] ch = str.replaceAll("\\s", "").toLowerCase().toCharArray();
            HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

            for (char c : ch)
                hm.put(c, hm.getOrDefault(c, 0) + 1);

            System.out.println(hm);

//            for (Map.Entry<Character, Integer> e : hm.entrySet())
//                System.out.println(e.getKey() + " : " + e.getValue());
        }

}
