package com.test;

public class StringSum {

    public static void main(String[] args) {
        String str = "Test56abc354test67";   //36

        System.out.println("Sum =" + stringSum(str));
    }


    public static int stringSum(String str) {

        int sum = 0;

//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            if (Character.isDigit(c)) {
//                int temp = Integer.parseInt(String.valueOf(c));
//                sum = sum + temp;
//            }
//        }

        char[] ch = str.toCharArray();

        for(char c : ch) {
                if (Character.isDigit(c)) {
                   int temp = Integer.parseInt(String.valueOf(c));
                   sum = sum + temp;
            }
        }

        return sum;
    }

}