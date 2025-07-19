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

// 

// This code defines a simple thread by extending the Thread class.
// The run method is overridden to provide the thread's behavior.
// This code defines a simple thread by extending the Thread class.// The run method is overridden to provide the thread's behavior.
// In the main method, an instance of MyThread is created and started.// The thread will print its name when it runs.
