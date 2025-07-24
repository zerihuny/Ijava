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

// This code demonstrates how to create and start a thread in Java.
// The MyThread class extends the Thread class and overrides the run method to define the thread's behavior.
// In the main method, an instance of MyThread is created and started, which will execute the run method in a new thread.
// The output will show that the thread is running, along with  
// the thread's name.