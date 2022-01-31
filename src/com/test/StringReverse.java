package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringReverse {
    public static String inputString(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string : ");
        return(s.nextLine());
    }

    public static void print(String s){
        System.out.println(s);
    }


    public static void main(String[] args){
//        print(stringReverse(inputString()));
//        print(sentenceReverse());
        print(reverseEachWord());

    }

    private static String reverseEachWord() {
        String str = inputString();
        List<String> l = Arrays.asList(str.split(" "));
        String reverse = "";
        for (String s : l) {
            reverse += (stringReverse(s) + " ");
        }
        return reverse;
    }

    private static String sentenceReverse() {
        String str = inputString();
//        String[] s = str.split(" ");
//        String reverse = "";
//        for( int i=s.length-1; i>=0; i--){
//            reverse += s[i];
//            if(i!=0)
//                reverse += " ";
//        }
        List<String> l = Arrays.asList(str.split(" "));
        String reverse = "";
        for(int i=l.size()-1 ; i>=0 ; i--)
        {
            reverse += l.get(i);
            if(i!=0)
                reverse += " ";
        }
        return reverse;
    }

    private static String stringReverse(String str) {
        String reverse = "";
        for(int i=str.length()-1 ; i>=0  ; i-- )
            reverse += str.charAt(i);

        return reverse;

    }
}
