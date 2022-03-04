package sandbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Generator {
    public static int[] randomArray(int length, int low, int high){
        int[] arr = new int[length];

        for(int i = 0; i < arr.length; i++){
            arr[i] = RandomNumber.randomNumber(low, high);
        }
        return arr;
    }

    public static List<Integer> randomSortedList(int length, int low, int high){
        List<Integer> nums = new ArrayList<>();

        for(int i = 0; i < length; i++){ //Adds <length> values to the list
            nums.add(RandomNumber.randomNumber(low, high));
        }

        Collections.sort(nums);

        return nums;
    }
}
