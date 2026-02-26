package com.vimo;

import java.util.HashMap;

public class CharacterCount {

    public static void main(String[] args){
        String str = " aaa bc ddDDD ";
        System.out.println(" Result : ");
        charCounter(str);
    }

    public static void charCounter(String str){
        HashMap<Character,Integer> hm = new HashMap<>();
        char[] ch = str.toCharArray();

        for (char c : ch){
            if(hm.get(c)==null)
                hm.put(c,1);
            else
                hm.put(c,hm.get(c)+1);
        }
        System.out.println(hm);

    }
}
