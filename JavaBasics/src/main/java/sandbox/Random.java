package sandbox;

public class Random {
    //Returns a random number between 0 and 'num'
    static int randomNumber(int num){
        return (int) (Math.random() * (num + 1));
    }

    //Returns a random number between 'min' and 'max'
    static int randomNumber(int min, int max){
        return (int) (Math.random() * ((max - min) + 1) + min);
    }
}
