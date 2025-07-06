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