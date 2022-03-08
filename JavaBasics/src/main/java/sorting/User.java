package sorting;

/*
* The Comparable interface defines the natural sorting of a class
* */

public class User implements Comparable<User>{
    Integer age;
    String firstName;
    String lastName;

    public User() {
    }

    public User(Integer age, String firstName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    //Strings sort by ASCII value
    @Override
    public int compareTo(User o) {
        return this.age.compareTo(o.age);
    }
}
