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


        int[] ages;
        ages = new int[5];  // correct array declaration
        ages[0] = 25;
        ages[1] = 30;       
        ages[2] = 35;
        ages[3] = 40;   
        ages[4] = 45;
        System.out.println(ages[2]);
        for(int i=0; i < ages.length; i++) {
            System.out.print(ages[i] + ","+ ",");
        }
 //  Java Arrays Are Objects
// Unlike languages like C/C++, arrays in Java are objects:
// They are created with new
// They store metadata (like their length)
        System.out.println(boxs.length);


        //  Shortcut for Initialization
        String[] namess = {"alice", "bOb", "Charlie", "dave", "eve"};
        for (String name : namess) {
            System.out.println(name);
        }
        // A multidimensional array is basically an array of arrays. In Java, the most common form is a two-dimensional (2D) array, which you can think of as a table with rows and columns.
        int [][] twoDArray = new int[3][4]; // 3 rows, 4 columns

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        // Accessing elements in a 2D array
        System.out.println("Element at row 1, column 2: " + matrix[1][2]); // Outputs 6 
        // Iterating through a 2D array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}