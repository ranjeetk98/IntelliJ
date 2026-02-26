package com.test;

// find max amount that can be robbed without police knows. No two adjacent house can be robbed

public class MaxSumWithoutAdjacent {

    public static void main(String[] args){

        int[] cash = {2,7,9,3,1};
        int[] cash1 ={1,2,3,1};

        int maxRobbingAmount = maxAmountRobbed(cash);
        System.out.println("Maxing amount that can be robbed without calling police : " + maxRobbingAmount);

    }

    public static int maxAmountRobbed(int[] input){

        int evenHouseCash = 0;
        int oddHouseCash = 0;

        for(int i=0; i<input.length; i++)
            if(i%2 ==0 )
                evenHouseCash += input[i];
            else
                oddHouseCash += input[i];

        return Math.max(evenHouseCash,oddHouseCash);

    }
}
