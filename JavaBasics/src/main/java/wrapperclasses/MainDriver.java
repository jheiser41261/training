package wrapperclasses;

import classesandobjects.Animal; //Imports the Animal class from its respective directory

public class MainDriver {
    /*
    * What is a wrapper class?
    * - Classes that "wrap" around the corresponding primitive data type
    *   - Essentially the class version of those data types:
    *
    * Type  |  Class Name
    * -------------------
    * boolean - Boolean
    * byte - Byte
    * char - Character
    * short - Short
    * int - Integer
    * float - Float
    * long - Long
    * double - Double
    *
    * [CLASS NAMES ARE CAPITALIZED DUE TO TITLE CASE NAMING CONVENTIONS]
    *
    * Why do these exist?
    * - Wrapper classes can have methods (because regular classes can, too)
    * - Certain data structures that don't accept primitive data types
    * */

    public static void main(String[] args){

        //All three of these are creating Booleans with the value of True
        Boolean b = true; //Autoboxing
        Boolean b1 = new Boolean(true); //Strikethrough means "deprecated"; works, but shouldn't be used
        Boolean b2 = Boolean.TRUE; //This is technically more correct, but it is a matter of preference

        Byte byt = 10; //Autoboxing

        Character c = 'c'; //Autoboxing
        char x = c.charValue(); //Unboxing; Explicitly returns the primitive value of c

        /*
        * What is autoboxing?
        * - Having a primitive type automatically converted to the correlated Wrapper Class equivalent
        *
        * What is unboxing?
        * - Converting a Wrapper Class to its correlated primitive data type
        *
        * All of this allows us to call methods for specific variables using dot notation
        */

        method1(5); //Passing a primitive value (5) into the method 'method1'
    }

    static void method1(Integer num){ //Converting the primitive value to its Wrapper Class equivalent
        Animal animal = new Animal("Justin", 100); //Allows an instantiation of Animal because of the import
    }
}
