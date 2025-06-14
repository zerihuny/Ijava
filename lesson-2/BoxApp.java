/* Create a class with instance variables for height, weight, and depth, making each
an integer. Create a Java application that uses your new class, sets each of these
 values in an object, and displays the values.
 */


class Box {
    int height;
    int weight;
    int depth;
}


public class BoxApp {
     public static void main(String[] args) {
        // Create an instance of Box
        Box myBox = new Box();

        // Set values
        myBox.height = 10;
        myBox.weight = 20;
        myBox.depth = 30;

        // Display the values
        System.out.println("Box Dimensions:");
        System.out.println("Height: " + myBox.height);
        System.out.println("Weight: " + myBox.weight);
        System.out.println("Depth: " + myBox.depth);
    }
    
}
