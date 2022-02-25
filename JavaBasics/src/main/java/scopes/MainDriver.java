package scopes;

import com.sun.source.tree.Scope;

public class MainDriver {
    public static void main(String[] args) {
        //Static scope does not require instantiation
        //ScopeExample.staticVar = 0;

        //Object scope does require instantiation
        //ScopeExample se = new ScopeExample();
        //se.instanceVar = 0;


        /*
         * What is casting?
         * - Trying to convert one data type to another
         *
         * If you need to explicitly cast, the syntax is (<data type> varName;)
         * */

        int x = 2;
        System.out.println((double) x); //Widening; casting to a larger data type (larger = more memory usage)

        double a = 3.7;
        System.out.println((int) a); //Narrowing; casting to a smaller data type
        //This process truncates the double; it DOES NOT ROUND (3.7 would be 3)
    }
}
