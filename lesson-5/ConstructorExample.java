class Dog{
    String name;
    int age;
    Dog(String name, int age) {
        this.name = name;
        this.age = age;

    }
}
public class ConstructorExample{
    public static void main(String[] args) {

        System.out.println("This is an example of creating connstructor in Java and You can create a Dog object using the constructor.");

        // Dog dog1 = new Dog("Buddy", 5);
        // or it can be created like this
        Dog dog1;
        dog1 = new Dog("Bobbie", 4);
        // dog1.name = "Max"; // You can change the name
        // dog1.age = 6; // You can change the age
        System.out.println("Dog's name: " + dog1.name);
        System.out.println("Dog's age: " + dog1.age);
        
    }   
}