package sorting;

import java.util.Comparator;

/*
 * Comparator allows us to define a custom sorting method
 * - We can then instantiate it and pass it into Collections.sort()
 * */

public class SortByFirstName implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return o1.firstName.compareTo(o2.firstName);
    }
}
