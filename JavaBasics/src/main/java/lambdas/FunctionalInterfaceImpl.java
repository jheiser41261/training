package lambdas;

public class FunctionalInterfaceImpl implements FunctionalInterface{

    @Override
    public String isEvenOrOdd(String word) {
        return word.length() % 2 == 0 ? "EVEN" : "ODD";
    }
}
