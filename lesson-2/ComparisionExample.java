public class ComparisionExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        if (a == b) {
            System.out.println("a is equal to b");
        } else {
            System.out.println("a is not equal to b");
        }
        // Comparing two String objects using '=='
        // This checks if both references point to the same object in memory
        String str1 = new String ("Hello");
        String str2 = new String ("Hello");
        
        if (str1.equals(str2)) {
            System.out.println("str1 is equal to str2");
        } else {
            System.out.println("str1 is not equal to str2");
        }
        System.out.println("str1 == str2: " + (str1 == str2)); // false, different objects
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true, same content
    }

}