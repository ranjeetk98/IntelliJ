package com.test;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String args[]) throws Exception{

        Integer[]  a = {2, 3, 5, 5, 7, 5, 3, 3, 2, 3};
        List<Integer> ls = Arrays.asList(a);

        ls = removeDuplicates(ls);
        System.out.println(ls);

    }

    public static List<Integer> removeDuplicates(List<Integer> ls){

        HashSet<Integer> hs = new HashSet<>(ls);
        ls = new ArrayList<>(hs);
        return ls;

    }

}