package sandbox;

public class MainDriver {
    public static void main(String[] args) {

        //Basic for loop - Counts to 10
        for (int i = 0; i <= 10; i++){ //The variable here is in Block Scope
            System.out.println(i);
        }
        System.out.println("--------------------");

        //While loop structure - Does the same as the above for loop
        int i = 0; //The variable here is declared in Method Scope

        while (i <= 10){ //This is referring to the Method Scope variable 'i'
            System.out.println(i);
            i++; //This increments the Method Scope variable 'i'
        }
        System.out.println("--------------------");

        //Testing random number generation from a different class
        System.out.println(Random.randomNumber(10));
        System.out.println(Random.randomNumber(50, 100));

    }
}
