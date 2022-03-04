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
    }
}
