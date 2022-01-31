package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        System.out.println("Enter a string : ");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        char[] ch = str.toCharArray();

        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();

        for(char c : ch){
            if(hm.containsKey(c))
                hm.put(c,hm.get(c)+1);
            else
                hm.put(c,1);
        }

        for(Map.Entry<Character,Integer> e : hm.entrySet())
        {
            System.out.println(e.getKey() + " : "+ e.getValue());
        }
    }

    

}
