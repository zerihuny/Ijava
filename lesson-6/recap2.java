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
    lelagnaw degmo mn ende hone tekekel lalhon echelalew
    ??
    
*/
}
public class Innerrecap2 {

    public static void demonstrateInnerClass() {
        // Creating an instance of the outer class
        recap2 outer = new recap2();

        // Creating an instance of the non-static inner class SuperClass
        recap2.SuperClass superInstance = outer.new SuperClass();

        // Creating an instance of the non-static inner class SubClass
        recap2.SubClass subInstance = outer.new SubClass();

        // Calling the overridden method
        subInstance.doSomething();

        System.out.println("Inner class advanced concepts demonstrated.");
        // Demonstrating the use of inner classes
        // This will print "Inner class advanced concepts demonstrated."
        // and show that the inner class can access the outer class's members.
        
    }
}