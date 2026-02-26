package com.test;

import java.util.*;

public class RemoveDuplicate {
    public static void main(String args[]) {

        int[] a = {2, 3, 5, 5, 7, 5, 3, 3, 2, 3};

//        Integer[] a1 = new Integer[a.length];
//        Arrays.setAll(a1, i -> a[i] );

        method1(a);
        method2(a);

    }

    static void method1(int[] a){
//        List<Integer> l = new ArrayList<Integer>();

        Set<Integer> set = new HashSet<>();

        for(int num : a)
            set.add(num);


        System.out.println(set);
    }
    static void method2(int[] a){
        // For this approach, array has to be sorted
        Arrays.sort(a);
        int i,j;
        int[] b = new int[a.length];

        for( i=0,j=0 ; i<a.length-1; i++)
            if(a[i]!=a[i+1])
                b[j++] = a[i];

        b[j] = a[i];

        //Assign the values of array b to a
        for(i=0; i<=j; i++)
            a[i] = b[i];

        // print array a
        for(i=0; i<=j; i++)
            System.out.print(a[i] + " ");
    }
}
