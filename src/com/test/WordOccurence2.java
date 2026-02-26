package com.test;

// count the occurence of sub-string in main-string which does not have a space

public class WordOccurence2 {

    public static void main(String[] args){

        String str = "ranjeetabcdjeetjksdhfjksdh,hjeetjksfds";
        String sub = "jeet";

        System.out.println(countOccurence(str,sub));
    }


    public static int countOccurence(String str, String sub){
        int counter=0;
        int index=0;

        while( (index = str.indexOf(sub,index)) != -1 ){
            counter++;
            index +=sub.length();
        }

        return counter;
    }

}
