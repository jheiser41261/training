package sorting;

import java.util.*;

public class MainDriver {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(22, "Justin", "Heiser"));
        users.add(new User(53, "Will", "Smith"));
        users.add(new User(41, "Alicia", "Keys"));

        Comparator<User> sortByFirst = new SortByFirstName();
        Collections.sort(users, sortByFirst);
        System.out.println(users);
    }
}
