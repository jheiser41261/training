package sandbox;

import java.util.ArrayList;
import java.util.List;

public class PracticeCode {
    public static void main(String[] args) {
        System.out.println("---------- Random Sorted List ----------"); //Personal Challenge - 3/3/22
        List<Integer> nums = new ArrayList<>(Generator.randomSortedList(10, 0, 100));

        for(int num : nums){
            System.out.println(num);
        }

        System.out.println();

        //Testing ternary syntax
        int num = 8;
        int num1 = 5;

        //Ternary syntax; alternate way of evaluating conditions within a print statement
        System.out.println(num % 2 == 0 ? num + " is even" : num + " is odd");

        //Ternary syntax can also be stored as a String
        String result = num1 % 2 == 0 ? num1 + " is even" : num1 + " is odd";
        System.out.println(result);
    }
}
