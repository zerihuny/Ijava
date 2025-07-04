// This code demonstrates the use of multiple interfaces in Java.
// It defines two interfaces, Flyable and Swimmable, and a class Duck that implements both interfaces.
// The Duck class provides implementations for the methods defined in both interfaces.      
// The main method creates an instance of Duck and calls its methods to demonstrate functionality.
// Interfaces allow for a form of multiple inheritance in Java, enabling classes to implement multiple behaviors.
// Interfaces allow for a flexible design, where classes can be designed to adhere to multiple contracts without being tied to a specific class hierarchy.
// This is a simple example of how interfaces can be used to define capabilities that can be shared across different classes.
// This code is a demonstration of using interfaces in Java.
interface Flyable {
    void fly();
}
interface Swimmable {
    void swim();
}
class Duck implements Flyable, Swimmable {
    // The Duck class implements both Flyable and Swimmable interfaces, so it can perform both actions.
    // intantiation of Duck class is necessary to access its methods.
    @Override
    public void fly(){
        System.out.println("Duck is flying");
    }
    public void swim(){
        System.out.println("Duck is swimming");
    }
    // This demonstrates the use of multiple interfaces in Java.
    // Interfaces allow for a form of multiple inheritance in Java, enabling classes to implement multiple behaviors    
    // Interfaces allow for a flexible design, where classes can be designed to adhere to multiple contracts without being tied to a specific class hierarchy.
    // This is a simple example of how interfaces can be used to define capabilities that can be   
    // shared across different classes.
    // This code is a demonstration of using interfaces in Java.
    // We instantiate Duck to create an object so we can call its fly() and swim()
    // methods. Without creating a Duck object, we can't use these instance methods.
    // The Duck class implements both Flyable and Swimmable interfaces, so it can perform both actions.
    // This demonstrates the use of multiple interfaces in Java.
}
public class Inter {
    public static void main(String[] args) {
        // We instantiate Duck to create an object so we can call its fly() and swim() methods.
// Without creating a Duck object, we can't use these instance methods.
// // The Duck class implements both Flyable and Swimmable interfaces, so it can perform both actions.
        // This demonstrates the use of multiple interfaces in Java.
// intantiation of Duck class is necessary to access its methods.
        // Interfaces allow for a form of multiple inheritance in Java, enabling classes to implement multiple behaviors 
        // Interfaces allow for a flexible design, where classes can be designed to adhere to multiple contracts without being tied to a specific class hierarchy.
        // This is a simple example of how interfaces can be used to define capabilities that can be
        // shared across different classes.
        // This code is a demonstration of using interfaces in Java.
        // We instantiate Duck to create an object so we can call its fly() and swim() methods.
        // Without creating a Duck object, we can't use these instance methods.
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }
}