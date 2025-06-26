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
    }
}