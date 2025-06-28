class User {
    private int age;

    public void setAge(int age) {
        if (age > 0) this.age = age;
    }

    public int getAge() { return age; }
}
public class rec {
    public static void main(String[] args) {
        User user = new User();
        user.setAge(25);
        System.out.println("User age: " + user.getAge());
        
        // Uncommenting the following line will cause a compilation error
        // because setAge is private.
        // user.setAge(-5);
        // System.out.println("User age: " + user.getAge());
        //what dp
        // System.out.println("User age: " + user.age); // This line would cause an error
        // because age is private and cannot be accessed directly.
        // The above line is commented out to avoid compilation error.
        // The setAge method allows setting the age only if it is greater than 0.
        // The getAge method allows retrieving the age.
        // This demonstrates encapsulation in Java, where the internal state of an object is protected
        // from direct access by external code, ensuring that the object's data is modified only through its methods.
        // Encapsulation helps maintain the integrity of the object's state and provides a clear interface for interaction
        // Mrphism will also do
        // 
        // In this example, the User class encapsulates the age property,
        // allowing it to be set only through the setAge method, which includes validation.
        //      mn alsh
        // sun will rise tomorrow
        // 
    }
}