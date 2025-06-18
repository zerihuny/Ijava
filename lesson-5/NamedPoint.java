
// This class extends java.awt.Point to include a name for the point.
// It demonstrates how to create a custom class that inherits from a Java standard library class.
// The NamedPoint class has a constructor that initializes the x and y coordinates as well as the name.
// It also includes a main method to create an instance of NamedPoint and print its properties.
// File: lesson-5/NamedPoint.java


import java.awt.Point;

class NamedPoint extends Point {
    String name;

    NamedPoint(int x, int y, String name) {
        super(x, y);
        this.name = name;
        
    }

    public static void main(String[] arguments) {
        NamedPoint np = new NamedPoint(5, 5, "SmallPoint");
        System.out.println("x is " + np.x);
        System.out.println("y is " + np.y);
        System.out.println("Name is " + np.name);
    }
}
