// This Java program demonstrates how to create threads using two different approaches:
// 1. By extending the `Thread` class.  
// 2. By implementing the `Runnable` interface.
// It includes two classes: `MyThread` which extends `Thread`, and `MyRunnable` which implements `Runnable`.
// The `run` method in each class defines the behavior of the thread when it is started.
// The `ThreadExample` class contains the `main` method where instances of both thread types are created and started.

public class ThreadExample {
    public static void main(String[] args) {
        // Creating a thread by extending Thread class
        Thread thread1 = new MyThread();
        thread1.start();

        // Creating a thread by implementing Runnable interface

        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();
    }
}
// This code demonstrates how to create threads in Java using two different approaches:
// 1. By extending the `Thread` class.      
// 2. By implementing the `Runnable` interface.
// The `MyThread` class extends `Thread` and overrides the `run` method to define the thread's behavior.
// The `MyRunnable` class implements `Runnable` and also overrides the `run` method to define the thread's behavior.    

// Extending Thread class
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread 1 is running.");
    }
}

// Implementing Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread 2 is running.");
    }
}
// This code demonstrates how to create threads in Java using two different approaches:
