package com.test;


import java.util.HashSet;

public class LongestNonRepeatingSubstring {

    public static void main(String[] args) {

        String str = "kabcdefabcbb";

        int left = 0;
        int maxLength = 0;
        int startIndex = 0;

        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < str.length(); right++) {

            // If duplicate found, shrink window from left
            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));

            // Update max length
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                startIndex = left;
            }
        }

        System.out.println("Longest Substring: "
                + str.substring(startIndex, startIndex + maxLength));
        System.out.println("Length: " + maxLength);
    }
}
