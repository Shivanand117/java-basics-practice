package OOPS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Transaction {
    private String type;
    private double amount;
    private String details;

    public Transaction(String type, double amount, String details) {
        this.type = type;
        this.amount = amount;
        this.details = details;
    }

    public String toString() {
        return type + " | Amount: " + amount + " | " + details;
    }
}

class Account {
    private String accountId;
    private String pin;
    private double balance;
    private ArrayList<Transaction> transactionHistory;

    public Account(String accountId, String pin, double balance) {
        this.accountId = accountId;
        this.pin = pin;
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();
    }

    public String getAccountId() { return accountId; }
    public String getPin() { return pin; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add(new Transaction("Deposit", amount, "Account: " + accountId));
    }

    public void withdraw(double amount) {
        balance -= amount;
        transactionHistory.add(new Transaction("Withdraw", amount, "Account: " + accountId));
    }

    public void transferTo(Account recipient, double amount) {
        balance -= amount;
        recipient.balance += amount;
        transactionHistory.add(new Transaction("Transfer", amount, "Sent to " + recipient.accountId));
        recipient.transactionHistory.add(new Transaction("Transfer", amount, "Received from " + accountId));
    }

    public ArrayList<Transaction> getTransactionHistory() {
        return transactionHistory;
    }
}

class Bank {
    private Map<String, Account> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    public void addAccount(Account account) {
        accounts.put(account.getAccountId(), account);
    }

    public Account getAccount(String accountId) {
        return accounts.get(accountId);
    }

    public boolean authenticate(String accountId, String pin) {
        Account account = accounts.get(accountId);
        return account != null && account.getPin().equals(pin);
    }
}

class ATM {
    private Bank bank;
    private Account currentUser;
    private ArrayList<Transaction> sessionHistory;
    private int attempts;

    public ATM(Bank bank) {
        this.bank = bank;
        this.sessionHistory = new ArrayList<>();
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (attempts < 3) {
            System.out.print("Enter User ID: ");
            String userId = sc.next();
            System.out.print("Enter PIN: ");
            String pin = sc.next();

            if (bank.authenticate(userId, pin)) {
                currentUser = bank.getAccount(userId);
                menu(sc);
                return;
            } else {
                attempts++;
                System.out.println("Invalid User ID or PIN");
                System.out.println("Attempts left: " + (3 - attempts));
            }

            if (attempts == 3) {
                System.out.println("Access denied after 3 incorrect attempts.");
                return;
            }
        }
    }

    private void menu(Scanner sc) {
        int choice;

        do {
            System.out.println("\nATM Menu");
            System.out.println("1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    showTransactionHistory();
                    break;
                case 2:
                    withdraw(sc);
                    break;
                case 3:
                    deposit(sc);
                    break;
                case 4:
                    transfer(sc);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }

    private void showTransactionHistory() {
        ArrayList<Transaction> history = currentUser.getTransactionHistory();

        if (history.isEmpty()) {
            System.out.println("No transactions in the current session.");
            return;
        }

        System.out.println("Transaction History:");
        for (Transaction t : history) {
            System.out.println(t);
        }
    }

    private void withdraw(Scanner sc) {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount > currentUser.getBalance()) {
            System.out.println("Insufficient Funds");
            return;
        }

        currentUser.withdraw(amount);
        sessionHistory.add(new Transaction("Withdraw", amount, "Account: " + currentUser.getAccountId()));
        System.out.println("Withdrawal successful");
    }

    private void deposit(Scanner sc) {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        currentUser.deposit(amount);
        sessionHistory.add(new Transaction("Deposit", amount, "Account: " + currentUser.getAccountId()));
        System.out.println("Deposit successful");
    }

    private void transfer(Scanner sc) {
        System.out.print("Enter recipient account ID: ");
        String recipientId = sc.next();
        Account recipient = bank.getAccount(recipientId);

        if (recipient == null) {
            System.out.println("Recipient not found.");
            return;
        }

        System.out.print("Enter amount to transfer: ");
        double amount = sc.nextDouble();

        if (amount > currentUser.getBalance()) {
            System.out.println("Insufficient Funds");
            return;
        }

        currentUser.transferTo(recipient, amount);
        sessionHistory.add(new Transaction("Transfer", amount, "From " + currentUser.getAccountId() + " to " + recipientId));
        System.out.println("Transfer successful");
    }
}

class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addAccount(new Account("1001", "1234", 5000));
        bank.addAccount(new Account("1002", "2345", 7000));
        bank.addAccount(new Account("1003", "3456", 9000));

        ATM atm = new ATM(bank);
        atm.start();
    }
}

public class ATMInterface {
    public static void main(String[] args) {
        Main.main(args);
    }
}
