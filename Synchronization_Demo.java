// Program to demonstrate Thread Synchronization
public class Synchronization_Demo {

    public static void main(String[] args) {

        Account acc = new Account(101, "Amit", 50000);
        System.out.println(acc);

        // Five account threads running parallel and sharing the same resource
        AccountThread thread[] = new AccountThread[5];
        for (int i = 0; i < 5; i++) {
            thread[i] = new AccountThread(acc, 1000 * (i + 1));
            thread[i].start(); // Start the thread
        }

        // Wait for all threads to complete
        for (int i = 0; i < 5; i++) {
            try {
                thread[i].join(); // waits main thread till execution of all child threads finish
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        
        System.out.println("--------------------------------------------------------");
        System.out.println(acc);
    }
}

// Assuming Account and AccountThread classes are defined appropriately
class Account {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                '}';
    }
}

class AccountThread extends Thread {
    private Account account;
    private double amount;

    public AccountThread(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.deposit(amount);
    }
}
