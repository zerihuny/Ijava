abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();

    void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    void makeSound() {
        System.out.println(name + " says: Bark!");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal dog = new Dog("Rex");
        dog.makeSound();
        dog.eat();

        Animal cat = new Cat("Whiskers");
        cat.makeSound();
        // cat.sleep();
    }
}
