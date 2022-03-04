package challenges;

import sandbox.Generator;

public class Challenges {
    public static void main(String[] args) {
        System.out.println("-------- Challenge 1 --------");
        ChallengeMethods.starTree(5);

        System.out.println("\n" + "-------- Challenge 2 --------");
        int[] sorted = ChallengeMethods.arraySort(Generator.randomArray(10,0,100));

        for (int num : sorted){
            System.out.println(num);
        }

        System.out.println("\n" + "-------- Challenge 3 --------");
        int[] numbers = Generator.randomArray(10,0,100);
        ChallengeMethods.oddEven(numbers);

        System.out.println("\n" + "-------- Challenge 4 --------");
        String sentence = "This challenge was a pain in the ass";
        System.out.println(PigLatin.encrypt(sentence));
        System.out.println(PigLatin.decrypt(PigLatin.encrypt(sentence)));

        /*//Testing ternary syntax
        int num = 8;
        int num1 = 5;

        //Ternary syntax; alternate way of evaluating conditions within a print statement
        System.out.println(num % 2 == 0 ? num + " is even" : num + " is odd");

        //Ternary syntax can also be stored as a String
        String result = num1 % 2 == 0 ? num1 + " is even" : num1 + " is odd";
        System.out.println(result);*/
    }
}