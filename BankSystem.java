
// 🏦 Bank Management System (Mini Project in Java)
// 🎯 Concepts Used:
// Inheritance
// Encapsulation
// Polymorphism (method overriding)
// Code reusability

import java.util.Scanner;

// 🔹 Base Class
class Account {
    protected String accountNumber;
    protected String holderName;
    protected double balance;

    public Account(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount + " | New Balance: ₹" + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount + " | Remaining Balance: ₹" + balance);
        } else {
            System.out.println("⚠️ Insufficient balance!");
        }
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: ₹" + balance);
    }
}

// 🔹 SavingsAccount class (Child)
class SavingsAccount extends Account {
    private double interestRate = 5.0;

    public SavingsAccount(String accNum, String name, double bal) {
        super(accNum, name, bal);
    }

    void addInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest Added: ₹" + interest + " | New Balance: ₹" + balance);
    }
}

// 🔹 CurrentAccount class (Child)
class CurrentAccount extends Account {
    private double overdraftLimit = 5000;

    public CurrentAccount(String accNum, String name, double bal) {
        super(accNum, name, bal);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount + " | New Balance: ₹" + balance);
        } else {
            System.out.println("⚠️ Overdraft limit exceeded!");
        }
    }

}

// 🔹 JointAccount class (Child)
class JointAccount extends Account {
    private String secondHolder;

    public JointAccount(String accNum, String holder1, String holder2, double bal) {
        super(accNum, holder1, bal);
        this.secondHolder = holder2;
    }

    @Override
    void displayDetails() {
        System.out.println("Joint Account Number: " + accountNumber);
        System.out.println("Holder 1: " + holderName);
        System.out.println("Holder 2: " + secondHolder);
        System.out.println("Balance: ₹" + balance);
    }
}

// 🔹 Main Class
public class BankSystem {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create Accounts
        SavingsAccount sa = new SavingsAccount("S001", "Praveen", 10000);
        CurrentAccount ca = new CurrentAccount("C001", "Kumar", 15000);
        JointAccount ja = new JointAccount("J001", "Praveen", "Ravi", 20000);

        System.out.println("🏦 Welcome to the Bank Management System");
        while (true) {
            System.out.println("\nChoose Account Type:");
            System.out.println("1. Savings Account");
            System.out.println("2. Current Account");
            System.out.println("3. Joint Account");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n--- Savings Account ---");
                    sa.displayDetails();
                    System.out.println("1. Deposit  2. Withdraw  3. Add Interest");
                    int c1 = sc.nextInt();
                    if (c1 == 1) {
                        System.out.print("Enter amount: ");
                        sa.deposit(sc.nextDouble());
                    } else if (c1 == 2) {
                        System.out.print("Enter amount: ");
                        sa.withdraw(sc.nextDouble());
                    } else if (c1 == 3) {
                        sa.addInterest();
                    }
                    break;

                case 2:
                    System.out.println("\n--- Current Account ---");
                    ca.displayDetails();
                    System.out.println("1. Deposit  2. Withdraw");
                    int c2 = sc.nextInt();
                    if (c2 == 1) {
                        System.out.print("Enter amount: ");
                        ca.deposit(sc.nextDouble());
                    } else if (c2 == 2) {
                        System.out.print("Enter amount: ");
                        ca.withdraw(sc.nextDouble());
                    }
                    break;

                case 3:
                    System.out.println("\n--- Joint Account ---");
                    ja.displayDetails();
                    System.out.println("1. Deposit  2. Withdraw");
                    int c3 = sc.nextInt();
                    if (c3 == 1) {
                        System.out.print("Enter amount : ");
                        ja.deposit(sc.nextDouble());
                    } else if (c3 == 2) {
                        System.out.print("Enter amount : ");
                        ja.withdraw(sc.nextDouble());
                    }
                    break;

                case 4:
                    System.out.println("✅ Thank you for using the Bank System!");
                    sc.close();
                    return;

                default:
                    System.out.println("⚠️ Invalid choice! Try again.");
            }
        }
    }
}
