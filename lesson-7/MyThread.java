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



// This code defines a simple thread class that extends Thread and overrides the run method.
// The main method creates an instance of MyThread and starts it, which will print the thread