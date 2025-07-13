// This Java program demonstrates basic usage of threads.
// It creates a custom thread by extending the Thread class.

class MyThread extends Thread {
    // The run() method contains the code that will be executed by the thread.
    public void run() {
        // Print numbers from 1 to 5 with a delay
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Count: " + i);
            try {
                // Sleep for 500 milliseconds to simulate work
                // the sleep in milliseconds 
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted.");
            }//
            //
            /// asdfasdf
            ///
            ///
            ///
            ///
            ///
            ///
            ///
            ///         
            ///
            ///            /// This is a comment that explains the purpose of the code
        }
        /// ene mn awke
        ///sdafasdf
        // ////////
        /// aS
        /// masd
        System.out.println(getName() + " finished.");
        // This is a tread that will allow concurrent 
    }
}
//

public class arch {
    public static void main(String[] args) {
        // Create two thread objects
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        // Start the threads; this calls their run() methods
        t1.start();
        t2.start();

        // Main thread prints a message
        System.out.println("Main thread finished.");
    }
}