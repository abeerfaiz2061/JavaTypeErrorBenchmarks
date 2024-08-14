import java.util.ArrayList;
import java.util.List;

class Animal {
    public void speak() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("Meow");
    }
}

public class Code2 {

    // Covariant: Attempting to add to a List<? extends Animal> will cause a compile-time error
    public static void makeAnimalsSpeak(List<? extends Animal> animals) {
        animals.add(new Cat()); // Compile-time error
    }

    // Contravariant: The following line tries to add an inappropriate type
    public static void addDogsToList(List<? super Dog> animals) {
        animals.add(new Cat()); // Compile-time error
    }

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());

        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());

        makeAnimalsSpeak(dogs);   // List<Dog> can be passed
        makeAnimalsSpeak(animals); // List<Animal> can be passed

        addDogsToList(cats); // Compile-time error: List<Dog> is not a supertype of Dog
    }
}
