// Superclass
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Main class to test
public class Extending {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound();  // Output: Animal makes a sound

        Dog myDog = new Dog();
        myDog.makeSound();     // Output: Dog barks

        Animal myPet = new Dog();
        myPet.makeSound();     // Output: Dog barks (because of overriding)
    }
}
