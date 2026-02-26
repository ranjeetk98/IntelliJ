//Java program to count occurrence of each character in a string

import java.util.HashMap;
import java.util.Scanner;

public class CountCharacter {

    public static void main(String args[]){

//        System.out.println("Enter a string : ");
//        Scanner scanner = new Scanner(System.in);
//        String s= scanner.nextLine();

        String s = " TESTING a test case";

        countCharacterOccurence(s);
    }

    public static void countCharacterOccurence(String s){
        HashMap<Character,Integer> hm = new HashMap<>();
        char[] ch = s.toLowerCase().replaceAll(" ","").toCharArray();

        for (char c : ch){

            if(hm.containsKey(c))
                hm.put(c,hm.get(c)+1);
            else
                hm.put(c,1);

//            hm.put(c,hm.getOrDefault(c,0)+1);
        }

        System.out.print(hm);

    }
}
