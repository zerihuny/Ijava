public class ConstructorExam {
    private String name;
    private int age;

    // Default constructor
    public ConstructorExam() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public ConstructorExam(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public ConstructorExam(ConstructorExam other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Main method to test constructors
    public static void main(String[] args) {
        ConstructorExam person1 = new ConstructorExam();
        ConstructorExam person2 = new ConstructorExam("Alice", 25);
        ConstructorExam person3 = new ConstructorExam(person2);

        person1.display();
        person2.display();
        person3.display();
    }
}