package classesandobjects;

public class MainDriver {
    //Main Method
    public static void main(String[] args){
        Animal animal1 = new Animal("Justin", 50);
        Animal animal2 = new Animal("Justin Heiser");

        System.out.println(animal1.name + ", Health: " + animal1.heal(50));
        System.out.println(animal2.name);
    }
}
