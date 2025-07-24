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

// This is a basic example of using threads in Java, demonstrating how to create and start a
// thread. The code is structured to be simple and clear, focusing on the essential aspects of thread creation and execution in Java.
// The code is designed to be easy to understand for those new to Java threading concepts.
// The class MyThread extends Thread and overrides the run method to print a message when the thread
// is running.

// The class MyThread extends Thread and overrides the run method to print a message when the thread is running.
// The Main class creates an instance of MyThread and starts it, which will execute the run method in a new thread.