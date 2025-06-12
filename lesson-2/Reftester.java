
import java.awt.Point;

class RefTester {
    public static void main(String[] args) {
       Point Pt1, Pt2;
       Pt1 = new Point(10, 20);
       Pt2 = Pt1; // pt2 is a reference to the same object as pt1   
        Pt2.x = 30; // Changing pt2 will also change pt1
        Pt2.y = 40; // Changing pt2 will also change pt1's y coordinate  
            System.out.println("pt1.x: " + Pt1.x); // Output: 30
            
            System.out.println("pt2.y: " + Pt2.y); // Output: 30
            
    }
}