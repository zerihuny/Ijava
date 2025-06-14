// Base class
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass 1
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog barks");
    }

    public void fetch() {
        System.out.println("Dog fetches the ball");
    }
}

// Subclass 2
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Cat meows");
    }

    public void scratch() {
        System.out.println("Cat scratches the sofa");
    }
}

public class CastingExamples {
    public static void main(String[] args) {
        // --------------------
        // UPCASTING
        // --------------------
        Animal a1 = new Dog();  // Dog is upcast to Animal
        Animal a2 = new Cat();  // Cat is upcast to Animal

        a1.makeSound(); // Outputs: Dog barks (runtime polymorphism)
        a2.makeSound(); // Outputs: Cat meows

        // a1.fetch(); // ❌ Error: fetch() not in Animal

        // --------------------
        // DOWNCASTING
        // --------------------
        if (a1 instanceof Dog) {
            Dog d = (Dog) a1; // Downcasting Animal to Dog
            d.fetch();        // Now we can call fetch()
        }

        if (a2 instanceof Cat) {
            Cat c = (Cat) a2; // Downcasting Animal to Cat
            c.scratch();      // Now we can call scratch()
        }

        // Unsafe downcasting example:
        Animal a3 = new Animal(); // Plain Animal
        if (a3 instanceof Dog) {
            Dog d2 = (Dog) a3;    // Won't run, avoids ClassCastException
            d2.fetch();
        } else {
            System.out.println("a3 is not a Dog.");
        }
    }
}
