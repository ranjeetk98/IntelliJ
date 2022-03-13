package com.test;

import java.util.*;

public class Anagram {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Enter two strings : ");
        String s1 = s.nextLine();
        String s2 = s.nextLine();


        char[] c1 = s1.toLowerCase().replaceAll(" ","").toCharArray();
        char[] c2 = s2.toLowerCase().replaceAll(" ","").toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1,c2))
            System.out.println("Anagram");
        else
            System.out.println("Not-Anagram");

    }

}
