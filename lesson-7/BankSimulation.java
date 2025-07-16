import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Shared resource: bank account
class BankAccount {
    private int balance = 0;

    // Synchronized to avoid race conditions
    public synchronized void deposit(int amount, String user) {
        System.out.println(user + " depositing $" + amount);
        balance += amount;
        System.out.println("New Balance: $" + balance);
    }

    public int getBalance() {
        return balance;
    }
}

// Method 1: Using Thread subclass
class DepositThread extends Thread {
    private BankAccount account;

    public DepositThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.deposit(100, getName());
    }
}

// Method 2: Using Runnable
class DepositRunnable implements Runnable {
    private BankAccount account;
    private String user;

    public DepositRunnable(BankAccount account, String user) {
        this.account = account;
        this.user = user;
    }

    public void run() {
        account.deposit(200, user);
    }
}

public class BankSimulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Thread method
        DepositThread t1 = new DepositThread(account);
        t1.setName("Thread-A");
        t1.start();

        // Runnable method
        Thread t2 = new Thread(new DepositRunnable(account, "Runnable-B"));
        t2.start();

        // ExecutorService method
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(() -> account.deposit(300, "Executor-C"));
        executor.submit(() -> account.deposit(400, "Executor-D"));
        executor.shutdown();

        System.out.println("Main thread done.");
    }
}
