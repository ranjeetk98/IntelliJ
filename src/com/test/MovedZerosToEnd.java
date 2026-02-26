package com.test;




public class MovedZerosToEnd {

    public static void main(String[] args){

        int[] a = {5,0,2,0,4,1,0};
        int position =0;

        for(int i=0; i<a.length;i++) {
            if (a[i] != 0) {
                a[position] = a[i];
                position++;
            }
        }

        while(position<a.length)
            a[position++]=0;

        for(int n : a)
         System.out.print(n+" ");

    }

}
