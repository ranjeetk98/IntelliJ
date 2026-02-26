package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortList {

    public static void main(String[] args){

       method1();
       method2();
    }

    public static void method1(){
        List<Object> list = Arrays.asList('a',2,'e',5,'i',6,'o',8,'u',9);

        List<Object> alphabet = new ArrayList<>();
        List<Object> number = new ArrayList<>();

        for(Object obj : list)
            if(obj instanceof Character)
                alphabet.add(obj);
            else
                number.add(obj);

        alphabet.addAll(number);

        System.out.println(alphabet);
    }


    public static void method2(){
        Object[] arr = {'a', 2, 'e', 5, 'i', 6, 'o', 8, 'u', 9};

        Object[] result = new Object[arr.length];
        int index = 0;

        // First pass: Add alphabets
        for (Object obj : arr) {
            if (obj instanceof Character) {
                result[index++] = obj;
            }
        }

        // Second pass: Add numbers
        for (Object obj : arr) {
            if (!(obj instanceof Character)) {
                result[index++] = obj;
            }
        }

        System.out.println(Arrays.toString(result));
    }



}
