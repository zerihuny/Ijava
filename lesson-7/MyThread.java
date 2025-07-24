class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running: " + getName());
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // Starts the thread
    }
}



// This Java code defines a simple thread using the Thread class.
// The MyThread class extends Thread and overrides the run method to print a message.
// In the main method, an instance of MyThread is created and started, which will execute
// the run method in a new thread.
// The output will show that the thread is running, along with the thread's name.   

// This code demonstrates how to create and start a thread in Java.
// The MyThread class extends the Thread class and overrides the run method to define the thread's behavior.
// In the main method, an instance of MyThread is created and started, which will execute the run method in a new thread.
// The output will show that the thread is running, along with  
// the thread's name.
// Note: The thread's name is automatically assigned by the JVM, but you can set it using setName method if needed.pr@65