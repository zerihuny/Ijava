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

// This code defines a simple thread class and starts a thread that prints its name.
// The MyThread class extends Thread and overrides the run method to print a message.   
// The Main class creates an instance of MyThread and starts it, which will execute the run method in a new thread.
// The output will show the thread's name when it runs.
// This is a basic example of using threads in Java, demonstrating how to create and start a thread.