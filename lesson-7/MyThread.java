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
