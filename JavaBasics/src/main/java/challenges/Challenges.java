package challenges;

import sandbox.Generator;
import java.util.Scanner;

public class Challenges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while(running) {
            System.out.println("\n" + "CHALLENGE MENU");
            System.out.println("1 - Star Tree");
            System.out.println("2 - Array Sort");
            System.out.println("3 - Odd/Even");
            System.out.println("4 - Pig Latin" + "\n");
            System.out.println("0 - Exit" + "\n");
            System.out.print("> ");

            String input = sc.nextLine();

            switch (input) {
                case "1":
                    System.out.println("-------- Challenge 1 - Star Tree --------");
                    System.out.println("Creates a 'tree' shape of asterisks" + "\n");

                    ChallengeMethods.starTree(5);

                    break;
                case "2":
                    System.out.println("\n" + "-------- Challenge 2 - Array Sort --------");
                    System.out.println("Generates and sorts a random array of numbers" + "\n");

                    int[] sorted = ChallengeMethods.arraySort(Generator.randomArray(10, 0, 100));

                    System.out.print(sorted.length + " random numbers: ");

                    for (int num : sorted) {
                        System.out.print(num + " ");
                    }

                    System.out.println();

                    break;
                case "3":
                    System.out.println("\n" + "-------- Challenge 3 - Odd/Even --------");
                    System.out.println("Determines if each number in a random array is odd or even" + "\n");

                    int[] numbers = Generator.randomArray(15, 0, 500);
                    ChallengeMethods.oddEven(numbers);

                    break;
                case "4":
                    System.out.println("\n" + "-------- Challenge 4 - Pig Latin --------");
                    System.out.println("Translates a sentence to and from Pig Latin" + "\n");

                    System.out.print("Enter a sentence: ");
                    String sentence = sc.nextLine();
                    boolean isValid = PigLatin.isValidSentence(sentence);

                    if(!isValid){
                        System.out.println("INVALID SENTENCE");
                        break;
                    }

                    System.out.println("Translated to Pig Latin: " + PigLatin.encrypt(sentence));
                    System.out.println("Translated back to English: " + PigLatin.decrypt(PigLatin.encrypt(sentence)));

                    break;
                case "0":
                    running = false;
                    break;
                default:
                    System.out.println("INVALID INPUT");
            }
        }
    }
}