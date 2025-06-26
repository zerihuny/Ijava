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

}
