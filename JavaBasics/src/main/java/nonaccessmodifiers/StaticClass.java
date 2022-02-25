package nonaccessmodifiers;

public class StaticClass {
    static int staticVar = 0; //Static variable

    public StaticClass(){ //Counts the number of instantiated objects
        staticVar += 1;
    }

    public void testMethod(){
        System.out.println("HOWDY!");
    }

    public static void printHello(){
        System.out.println("HELLO!");
    }

    //Static Block - Runs when the StaticClass is first referenced in memory; runs BEFORE the initializer block
    static {
        System.out.println("Static Block");
    }
}
