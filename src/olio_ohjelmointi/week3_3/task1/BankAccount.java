package olio_ohjelmointi.week3_3.task1;

public class BankAccount {
    private static int totalAccounts = 0;
    private static int nextId = 1;

    private int accountNumber;
    private int balance;

    public BankAccount(int amount){
        this.accountNumber = nextId;
        this.balance = amount;
        totalAccounts++;
        nextId++;
    }
    public void deposit(int amount){
        if (amount > 0){
            balance += amount;

        }
    }
    public void withdraw(int amount){
        if (amount <= balance){
            balance -= amount;
        }
    }
    public int getAccountNumber(){return accountNumber;}
    public int getBalance(){return balance;}
    public static int getTotalAccounts(){return totalAccounts;}


    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        account1.deposit(500);
        account2.withdraw(800);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
    }
}