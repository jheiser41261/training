package nonaccessmodifiers;

public class FinalClass {
    final int age = 30;

    void method(){
        //age = 20;

        //The variable cannot change, since it is defined as a final
    }
}
