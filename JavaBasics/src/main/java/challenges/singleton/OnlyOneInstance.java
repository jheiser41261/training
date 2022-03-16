package challenges.singleton;

public class OnlyOneInstance {
    private static OnlyOneInstance onlyOneInstance = null;

    private OnlyOneInstance(){

    }

    public static OnlyOneInstance onlyOneInstance(){
        if (onlyOneInstance == null){
            onlyOneInstance = new OnlyOneInstance();
        }
        return onlyOneInstance;
    }

}
