package com.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// count the occurence of sub-string in the main string

public class WordOccurence {

    public static void main(String[] args) {

        String str = "ran jeet abcd jeet jksdhfjksdh,h jeet jksfds";
        String sub = "jeet";
        System.out.println(countOccurence(str,sub));

    }

    public static int countOccurence(String str, String sub){

      List<String> ls = Arrays.asList(str.split(" "));
      HashMap<String,Integer> hm = new HashMap<String,Integer>();

        for(String s : str.split(" ") )
            if(hm.containsKey(s))
                hm.put(s,hm.get(s)+1);
            else
                hm.put(s,1);

            System.out.println(ls);
            return hm.get(sub);
    }


}
