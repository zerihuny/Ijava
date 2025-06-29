public class recap2 {
    public class SuperClass {
    protected void doSomething() {}
}

public class SubClass extends SuperClass {
    // VALID: more accessible
    public void doSomething() {}

    // INVALID: less accessible
    // private void doSomething() {} // ❌ COMPILATION ERROR
}
    // public static void main(String[] args) {
    //     SubClass sub = new SubClass();
    //     sub.doSomething(); // Calls the public method in SubClass
    //     System.out.println("Method executed successfully.");
    // }
    // eretalle
    /*
    
    yhe nw my heatmap
    lelagnaw degmo mn ende hone balawkem yhenen hulu senager misera
    ??
*/
}
