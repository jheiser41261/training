package challenges;

public class Challenges {
    public static void main(String[] args) {
        System.out.println("-------- Challenge 1 --------");

        //Calling Challenge 1
        starTree(5);

        System.out.println("-------- Challenge 2 --------");

        //Calling Challenge 2
        int[] arr = {508, 76, 1, 273, 3, 93, 6, 425};
        int[] sorted = arraySort(arr);

        //Challenge 2 - Enhanced for loop (read as "for num in sorted"); increments automatically
        for (int num : sorted){
            System.out.println(num);
        }

        System.out.println("-------- Challenge 3 --------");

        //Calling Challenge 3
        int[] numbers = {67, 42, 48, 95, 87, 13};
        oddEven(numbers);

        System.out.println("-------- Challenge 4 --------");
        String sentence = "This challenge was a pain in the ass";
        System.out.println(PigLatin.encrypt(sentence));
        System.out.println(PigLatin.decrypt(PigLatin.encrypt(sentence)));

        System.out.println();
    }

    //Challenge 1 - 2/23/22 - Copied
    static void starTree(int num){
        for (int i = 1; i <= num; i++){ //Each iteration is one row
            for (int j = 0; j < i; j++){ //Each iteration is one column
                System.out.print("*"); //Number of stars is equal to row number
            }
            System.out.println(); //Prints a blank line after each iteration
        }
    }

    //Challenge 2 - 2/24/22 - Copied
    static int[] arraySort(int[] sort){
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
    static void oddEven(int[] oddeven){
        for (int i = 0; i < oddeven.length; i++){
            if (oddeven[i] % 2 == 0){
                System.out.println(oddeven[i] + " is an even number");
            } else {
                System.out.println(oddeven[i] + " is an odd number");
            }
        }

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