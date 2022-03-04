package challenges;

public class ChallengeMethods {

    //Challenge 1 - 2/23/22 - Copied
    public static void starTree(int num){
        for (int i = 1; i <= num; i++){ //Each iteration is one row
            for (int j = 0; j < i; j++){ //Each iteration is one column
                System.out.print("*"); //Number of stars is equal to row number
            }
            System.out.println(); //Prints a blank line after each iteration
        }
    }

    //Challenge 2 - 2/24/22 - Copied
    public static int[] arraySort(int[] sort){ //Accepts an int array to sort numerically
        for (int i = 0; i < sort.length; i++){
            for (int j = 0; j < sort.length - 1; j++){
                if (sort[j] > sort[j + 1]){
                    int temp = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = temp;
                }
            }
        }
        return sort;
    }

    //Challenge 3 - 2/25/22 - Original (Determine if an integer is even or odd)
    public static void oddEven(int[] oddeven){
        for (int j : oddeven) {
            if (j % 2 == 0) {
                System.out.println(j + " is an even number");
            } else {
                System.out.println(j + " is an odd number");
            }
        }
    }
}
