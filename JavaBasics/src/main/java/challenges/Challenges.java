package challenges;

import sandbox.Generator;

import java.util.Locale;
import java.util.Scanner;

public class Challenges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while(running){
            System.out.println("\n" + "CHALLENGE MENU");
            System.out.println("1 - Star Tree");
            System.out.println("2 - Array Sort");
            System.out.println("3 - Odd/Even");
            System.out.println("4 - Pig Latin");
            System.out.println("5 - Palindrome Test\n");
            System.out.println("0 - Exit\n");
            System.out.print("> ");

            String input = sc.nextLine();

            switch (input) {
                case "1":
                    System.out.println("-------- Challenge 1 - Star Tree --------");
                    System.out.println("Creates a descending 'staircase' of asterisks\n");

                    System.out.print("Enter a number: ");
                    String layers = sc.nextLine();

                    //Checks if the String 'layers' only contains numbers
                    if(!layers.matches("[0-9]+")){
                        System.out.println("INVALID INPUT\n");
                        break;
                    }

                    System.out.println("\n-------- " + layers + " Layers --------");

                    //Converts the contents of 'layers' to an int and generates that number of layers
                    ChallengeMethods.starTree(Integer.parseInt(layers));

                    break;
                case "2":
                    System.out.println("\n-------- Challenge 2 - Array Sort --------");
                    System.out.println("Generates and sorts a random array of numbers\n");

                    System.out.print("Enter the total amount of numbers: ");
                    String val1 = sc.nextLine();
                    System.out.print("Enter the first boundary: ");
                    String val2 = sc.nextLine();
                    System.out.print("Enter the second boundary: ");
                    String val3 = sc.nextLine();

                    if(!(val1.matches("[0-9]+") && val2.matches("[0-9]+") && val3.matches("[0-9]+"))){
                        System.out.println("\nINVALID INPUT\n");
                        break;
                    }

                    int length = Integer.parseInt(val1);
                    int low = Integer.parseInt(val2);
                    int high = Integer.parseInt(val3);

                    int[] sorted = ChallengeMethods.arraySort(Generator.randomArray(length, low, high));

                    System.out.print("\n" + sorted.length + " random numbers between " + low + " and " + high + ": ");

                    for (int num : sorted) {
                        System.out.print(num + " ");
                    }

                    System.out.println();
                    break;
                case "3":
                    System.out.println("\n-------- Challenge 3 - Odd/Even --------");
                    System.out.println("Determines if each number in a random array is odd or even\n");

                    int[] numbers = Generator.randomArray(15, 0, 500);
                    ChallengeMethods.oddEven(numbers);

                    break;
                case "4":
                    System.out.println("\n-------- Challenge 4 - Pig Latin --------");
                    System.out.println("Translates a sentence to and from Pig Latin\n");

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
                case "5":
                    System.out.println("\n-------- Challenge 5 - Palindrome Test --------");
                    System.out.println("Tests whether or not a given word/phrase is a palindrome\n");

                    System.out.print("Enter a word/phrase: ");
                    String word = sc.nextLine();

                    boolean isPalindrome = ChallengeMethods.isPalindrome(word);

                    if(isPalindrome){
                        System.out.println("\n" + word.toUpperCase() + " is a palindrome");
                        break;
                    }

                    System.out.println("\n" + word.toUpperCase() + " is NOT a palindrome");

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