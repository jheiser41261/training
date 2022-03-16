package challenges.singleton;

public class MainDriver {
    public static void main(String[] args) {
        OnlyOneInstance x = OnlyOneInstance.onlyOneInstance();
        OnlyOneInstance y = OnlyOneInstance.onlyOneInstance();
        OnlyOneInstance z = OnlyOneInstance.onlyOneInstance();

        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        System.out.println(z.hashCode());
    }
}
