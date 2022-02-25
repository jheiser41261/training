package scopes;

/*
* Scope is essentially where a variable can be seen/accessed within a class
*
* There are 4 scopes in Java:
* - Class/Static scope
*   - You cannot access any variables in the other scopes
* - Object/Instance scope
*   - Can access Class/Static scope, but not Method or Block
* - Method scope
*   - Can access all above scopes, but not Block
* - Block scope
*   - Can access all other scopes
* */

public class ScopeExample {
    static int staticVar = 1; //Static scope
    int instanceVar = 2; //Instance scope

    static void staticMethod(){ //Static scope
        staticVar = 0;
    }

    void instanceMethod(){ //Instance scope
        staticMethod(); //Instance scope can access both static methods...
        staticVar = 0; //...and variables
        instanceVar = 0;
    }

    void methodMethod(){ //Method scope
        staticMethod();
        instanceMethod();
        staticVar = 0;
        instanceVar = 0;

        int methodVar = 3;

        if (true){ //These curly braces represent a block
            staticMethod();
            staticVar = 0;

            instanceMethod();
            instanceVar = 0;

            methodMethod();
            methodVar = 0;

            int blockVar = 4;

            if(true){ //A block within a block
                blockVar = 0;
            } //End of inner block
        } //End of block

        //Method scope cannot access blockVar

    }
}
