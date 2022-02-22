package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test
{

    public static void main(String args[])
    {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter two strings : ");
        String s1 = s.nextLine();
        String s2 = s.nextLine();

        HashMap<Character,Integer> hm1 = CountChar.charCount(s1);
        HashMap<Character,Integer> hm2 = CountChar.charCount(s2);

        if(compare(hm1,hm2))
            System.out.println("Anagram");
        else
            System.out.println("Not-Anagram");

     }

    static Boolean compare(HashMap<Character,Integer> hm1, HashMap<Character,Integer> hm2)
    {
        for (Map.Entry<Character, Integer> e : hm1.entrySet())
        {
            if (hm1.size() != hm2.size())
                return false;

            if (hm2.containsKey(e.getKey()))
                if (e.getValue() != hm2.get(e.getKey()))
                    return false;
        }
        return true;
    }
}




