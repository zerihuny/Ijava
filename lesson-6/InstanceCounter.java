

public class InstanceCounter {
   private static int numInstances = 0;

   protected static int getCount() {
        return numInstances;
   }
//  // This method is private so that it can only be called
//  // from within this class.
   // It increments the number of instances.
   // It is static so that it can be called without an instance.
   // This is a common pattern in Java to keep track of the number of instances created.



   private static void addInstance() {
       numInstances++;
   }
// 
// what should be typed here
   InstanceCounter() {
       InstanceCounter.addInstance();
   }

   public static void main(String[] arguments) {
       System.out.println("Starting with " +
            InstanceCounter.getCount() + " objects");
       for (int i = 0; i < 500; ++i) {
            new InstanceCounter();
       }
       System.out.println("Created " +
            InstanceCounter.getCount() + " objects");
   }
}

