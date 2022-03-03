package sandbox;

import java.util.ArrayList;
import java.util.List;

public class RandomGenerator {
    public static List<Integer> randomList(int length, int low, int high){
        List<Integer> nums = new ArrayList<>();

        for(int i = 0; i < length; i++){ //Adds <length> values to the list
            nums.add(RandomNumber.randomNumber(low, high));
            System.out.println(nums.get(i));
        }
        return nums;
    }
}