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

    public static void main(String[] args){
//        stringReverse();
        sentenceReverse();
//        reverseEachWord();
    }

    private static void reverseEachWord() {
        String str = inputString();



    }

    private static void sentenceReverse() {
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
        System.out.println("Reverse : "+ reverse);
    }

    private static void stringReverse() {
        String str = inputString();
        String reverse = "";
        for(int i=str.length()-1 ; i>=0  ; i-- )
            reverse += str.charAt(i);

        System.out.println("Output : "+ reverse);

    }
}
