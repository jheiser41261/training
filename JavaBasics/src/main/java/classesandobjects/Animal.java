package classesandobjects;

/*
* What is a class?
* - A blueprint for creating objects
*
* What is an object?
* - An instance of a class
* - Objects contain states (variables) and behaviors (methods)
*
* What is a constructor?
* - A method that is called when an object is instantiated
* - An instantiation with no arguments utilizes the default constructor
* - The default constructor is inaccessible as soon as a custom constructor is created
* - You would have to explicitly recreate a new constructor with no arguments
*
* What is an initializer block?
* - A method without a name that runs as soon as an object is instantiated
* - Very rarely will this be used
* */

//Class
public class Animal {
    String name;
    int health = 0;

    int heal(int gains){
        health += gains;
        return health;
    }

    //Constructor(s)
    public Animal(String animalName, int originalHP){
        name = animalName;
        health = originalHP;
    }

    public Animal(String animalName){
        name = animalName;
    }

    //Initializer Block
    {
        System.out.println("Object Initialized");
    }
}
