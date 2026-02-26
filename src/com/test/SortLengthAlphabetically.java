package com.test;


//write a java program to sort the list based upon length of string and then based upon alphabetical order

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortLengthAlphabetically {

    public static void main(String[] args){
        List<String> list = Arrays.asList("apple", "bat", "banana", "cow", "cat", "apricot", "dog");

        list.sort(Comparator
                .comparingInt(String::length)
                .thenComparing(String::compareTo));

        System.out.println(list);


    }
}
