package com.vimo;


//Test56abc354test67

public class test2 {

    public static void main(String[] args){
        String str = "Test56abc354test67";

        int Sum = intSum(str);

        System.out.println("Sum =" + Sum);
    }

    public static int intSum(String str){
        int sum = 0;

        for(int i=0; i<str.length();i++){
            char temp = str.charAt(i);
            if(Character.isDigit(temp))
            {
                int b = Integer.parseInt(String.valueOf(temp));
                sum = sum+b;
            }

        }

        return sum;
    }
}
