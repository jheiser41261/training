package sandbox;

public class RandomNumber {
    public static int randomNumber(int num){
        return (int) (Math.random() * (num + 1));
    }

    public static int randomNumber(int low, int high){
        return (int) (Math.random() * ((high - low) + 1)) + low;
    }
}
