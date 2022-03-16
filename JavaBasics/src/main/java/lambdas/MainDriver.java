package lambdas;

public class MainDriver {
    public static void main(String[] args) {
        //External class implementation
        FunctionalInterface func = new FunctionalInterfaceImpl();
        System.out.println(func.isEvenOrOdd("Test"));

        //In-line implementation
        FunctionalInterface func1 = new FunctionalInterface() {
            @Override
            public String isEvenOrOdd(String word) {
                return word.length() % 2 == 0 ? "EVEN" : "ODD";
            }
        };

        System.out.println(func1.isEvenOrOdd("Test1"));

        //Lambdas are "sugar syntax" for the in-line implementation
        FunctionalInterface func2 = (word) -> {
            return word.length() % 2 == 0 ? "EVEN" : "ODD";
        };

        //Single-line lambdas can be implemented as a single line
        FunctionalInterface func3 = word -> word.length() % 2 == 0 ? "EVEN" : "ODD";
    }
}
