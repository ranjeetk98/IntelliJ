package com.test;

public class Subsequence {

    public static boolean isSubsequence(String sub, String main) {
        int i = 0, j = 0;

        while (i < sub.length() && j < main.length()) {
            if (sub.charAt(i) == main.charAt(j)) {
                i++;
            }
            j++;
        }


        return i == sub.length();
    }

    public static void main(String[] args) {
        String mainString = "automationtesting";
        String subString = "autotest";

        if (isSubsequence(subString, mainString)) {
            System.out.println("The string \"" + subString + "\" is a subsequence of \"" + mainString + "\"");
        } else {
            System.out.println("The string \"" + subString + "\" is NOT a subsequence of \"" + mainString + "\"");
        }
    }
}
