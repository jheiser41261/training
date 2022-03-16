package designpatterns;

/*
* What is a design pattern?
* - A solution to a common problem in computer science
*
* What is the singleton design pattern?
* - It guarantees that only a single instance of an object can exist at a time
* - Useful for saving memory in the heap
* */

public class Singleton {
    private static Singleton obj = null;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if (obj == null) {
            obj = new Singleton();
        }
        return obj;
    }
}
