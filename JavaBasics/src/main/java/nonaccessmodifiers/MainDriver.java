package nonaccessmodifiers; //Identifies where we are in reference to the root folder 'java'

public class MainDriver {

    /*
    * What are non-access modifiers?
    * - Keywords that can manipulate specific entities
    *
    * Types of non-access modifiers:
    * - static
    *   - The entity is directly tied to the class
    *   - Anything that is static can be used without being instantiated
    * - final
    *   - Functionality changes depending on what entity it is assigned to
    *       - Variables: Cannot change the value
    *       - Methods: Cannot be overriden
    *       - Classes: Cannot be inherited (cannot be a parent class)
    * */

    public static void main (String[] args){
        //Instantiating five objects
        StaticClass sc1 = new StaticClass();
        StaticClass sc2 = new StaticClass();
        StaticClass sc3 = new StaticClass();
        StaticClass sc4 = new StaticClass();
        StaticClass sc5 = new StaticClass();

        //Printing the count of instantiated objects
        System.out.println(StaticClass.staticVar);

        //Instantiating an object and calling the method 'testMethod'
        StaticClass sc6 = new StaticClass();
        sc6.testMethod();

        //Prints the static method 'printHello'
        StaticClass.printHello();
    }
}
