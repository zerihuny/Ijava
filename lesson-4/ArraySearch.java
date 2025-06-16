public class ArraySearch {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 15, 20},
            {25, 30, 35},
            {40, 42, 45}
        };

        int target = 42;
        boolean found = false;

        searchLoop: // label for the outer loop
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Found " + target + " at row " + i + ", column " + j);
                    found = true;
                    break searchLoop; // exit both loops at once
                }
            }
        }

        if (!found) {
            System.out.println(target + " not found in matrix.");
        }
    }
}
