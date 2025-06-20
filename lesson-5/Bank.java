class Account {
    String name;
    double balance;

    Account(String name) {
        this(name, 0.0);
    }

    Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void display() {
        System.out.println("Name: " + name + ", Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(String name, double balance, double rate) {
        super(name, balance); // calls parent constructor
        this.interestRate = rate;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Interest Rate: " + interestRate);
    }
}

public class Bank {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("Binium", 1000.0, 5.0);
        s.display();
    }
}
