package com.test;

public class StringConversion {

    public static void main(String[] args) {
        String str = "tomorrow";
        char[] c = str.toCharArray();
        stringConvert(c);


    }

    public static void stringConvert(char[] c) {
        for (int i=0; i<c.length; i++) {
            if (c[i] == 'o')
                c[i] = '3';
            if(c[i]=='r')
                c[i] ='2';
        }

        System.out.println(c);
    }

}
