/*
Array Rules: Type Consistency
All items in an array must be of the same type:

You can’t mix types (e.g., int and String).

You can store different subclasses if the array type is a superclass.

 */
public class afro {
  
    

    public static void main(String[] args) {
        // System.out.println("Hello from Afro!");
        Object[] boxs = new Object[10];
        boxs[0] = "Hello";
        boxs[1] = 123;
        boxs[2] = 45.67;
        boxs[3] = true;
        boxs[4] = new int[]{1, 2, 3};
        System.out.println(boxs[4]);


    int ages[];
    ages = new int[5];
 //  Java Arrays Are Objects
// Unlike languages like C/C++, arrays in Java are objects:
// They are created with new
// They store metadata (like their length)
        System.out.println(boxs.length);
    }
}