package com.test;

public class StringSum2 {

    public static void main(String[] args) {

        String str = "abc12xyz3pqr45";       //60

        System.out.println("Sum =" + stringSum(str));
    }

    public static int stringSum(String str)
    {
        int sum = 0;
        String number = "";
        for (int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            if (Character.isDigit(c))
                number = number + c;
            else if (!number.isEmpty())
            {
                sum = sum + Integer.parseInt(number);
                number = "";

            }
        }

        // add last number if string ends with digit
        if (!number.isEmpty())
            sum = sum + Integer.parseInt(number);

        return sum;

    }


}