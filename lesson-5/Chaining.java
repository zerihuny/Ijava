class Student {
    String name;
    int age;
    String course;

    // Constructor with one parameter
    Student(String name) {
        this(name, 18); // calls the second constructor
    }

    // Constructor with two parameters
    Student(String name, int age) {
        this(name, age, "Undeclared"); // calls the third constructor
    }

    // Constructor with three parameters
    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }
}
// Example usage    
public class Chaining {
    public static void main(String[] args) {
        // Creating a Student object using the first constructor
        Student student1 = new Student("Alice");
        System.out.println("Name: " + student1.name + ", Age: " + student1.age + ", Course: " + student1.course);

        // Creating a Student object using the second constructor
        Student student2 = new Student("Bob", 20);
        System.out.println("Name: " + student2.name + ", Age: " + student2.age + ", Course: " + student2.course);

        // Creating a Student object using the third constructor
        Student student3 = new Student("Charlie", 22, "Computer Science");
        System.out.println("Name: " + student3.name + ", Age: " + student3.age + ", Course: " + student3.course);
    }
}