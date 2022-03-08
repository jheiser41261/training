package challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChallengeMethods {

    //Challenge 1 - 2/23/22 - Copied
    public static void starTree(int num){
        for (int i = 1; i <= num; i++){ //Each iteration is one row
            for (int j = 0; j < i; j++){ //Each iteration is one column
                System.out.print("*"); //Number of stars is equal to row number
            }
            System.out.println(); //Moves to the next line
        }
    }

    //Challenge 2 - 2/24/22 - Copied
    public static int[] arraySort(int[] sort){ //Accepts an int array to sort numerically
        for (int i = 0; i < sort.length; i++){ //Iterates through the entire array until it is sorted
            for (int j = 0; j < sort.length - 1; j++){ //Iterates through the array while checking individual numbers
                if (sort[j] > sort[j + 1]){ //Checks if the current highlighted value is greater than the next one
                    int temp = sort[j]; //Stores the current value in a temporary variable
                    sort[j] = sort[j + 1]; //Assigns the next value to the current index
                    sort[j + 1] = temp; //Reassigns the held temporary value to the next index
                }
            }
        }
        return sort;
    }

    //Challenge 3 - 2/25/22 - Original
    public static void oddEven(int[] oddeven){

        //Preparing lists for even and odd numbers
        List<Integer> evenNums = new ArrayList<>();
        List<Integer> oddNums = new ArrayList<>();

        //Separating odd and even numbers into their respective lists
        for(int j : oddeven) {
            if (j % 2 == 0) {
                evenNums.add(j);
            } else {
                oddNums.add(j);
            }
        }

        //Sorting each list numerically
        Collections.sort(evenNums);
        Collections.sort(oddNums);

        //Displaying even numbers
        System.out.print("Even Numbers: ");
        for(int evenNum : evenNums){
            System.out.print(evenNum + " ");
        }

        //Displaying odd numbers
        System.out.print("\nOdd Numbers: ");
        for(int oddNum : oddNums){
            System.out.print(oddNum + " ");
        }

        System.out.println();
    }

    //Challenge 4 is contained within the "PigLatin" class

    //Challenge 5 - 3/4/22 - Original
    public static Boolean isPalindrome(String word){
        word = word.toLowerCase(); //Converts the word to all lowercase
        StringBuilder test = new StringBuilder(word).reverse(); //Creates a StringBuilder containing the reverse of the word
        return test.toString().equals(word); //Checks if the reversed StringBuilder still matches the word
    }
}
