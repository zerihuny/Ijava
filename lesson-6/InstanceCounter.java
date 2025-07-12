public class InstanceCounter {
   private static int numInstances = 0;

   // Returns the current number of instances created
   protected static int getCount() {
      return numInstances;
   }

   // Increments the number of instances
   private static void addInstance() {
      numInstances++;
   }

   // Constructor increments the instance count
   InstanceCounter() {
      InstanceCounter.addInstance();
   }

   public static void main(String[] arguments) {
      System.out.println("Starting with " +
         InstanceCounter.getCount() + " objects");
      for (int i = 0; i < 500; ++i) {
         InstanceCounter ic = new InstanceCounter();
      }
      System.out.println("Created " +
         InstanceCounter.getCount() + " objects");
      System.out.println("Exiting with " +
         InstanceCounter.getCount() + " objects");
         
   }
}
