
import java.util.Scanner;


// 🏦 Bank Management System (Mini Project in Java)
// 🎯 Concepts Used:
// Inheritance
// Encapsulation
// Polymorphism (method overriding)
// Code reusability


class Account{
    protected String AccNumber;
    protected String HolderName;
    protected double Balance;

    public Account(String AccNumber,String HolderName,double  Balance){
        this.AccNumber=AccNumber;
        this.HolderName = HolderName;
        this.Balance = Balance;
    }
    public void Deposit(double amount){
        Balance += amount;
        System.out.println("Deposit Amount : " + amount + "\nNew Balance : " + Balance );
    }

    public void Withdraw(double amount){
        if(amount<=Balance){
            Balance -= amount;
            System.out.println("Withdraw amount : " + amount + "\nNew Balance : " + Balance);
        }else{
            System.out.println("Insufficient Balance");
        }
    }
    public void AccDetails(){
        System.out.println("\nAccount Number : " + AccNumber);
        System.out.println("holder Name : " + HolderName);
        System.out.println("Account Balance : " + Balance);
    }
}

class SavingsAccount extends Account{
    double interestRate = 7.0;
    public SavingsAccount(String AccNumber,String HolderName,double Balance){
        super(AccNumber, HolderName, Balance);
    }
    public void addInterest(){
        double interest = Balance * (interestRate/100);
        Balance += interest;
        System.out.println("Interest Amount : " + interest + "\nNew Balance : " + Balance);
    }
}
class CurrentAccount extends Account{
    double overdraftLimit = 5000;
    public CurrentAccount(String AccNum,String HolderName,double Balance){
        super(AccNum, HolderName, Balance);
    }
    public void withdraw(double amount){
        if(amount <= Balance+overdraftLimit){
            Balance -= amount;
            System.out.println("Withdraw Amount : " + amount + "\nNew Balance : " + Balance);
        }else{
            System.out.println("Insufficient Balance");
        }
    }
}
class JointAccount extends Account{
    String SecondHolder;
    public JointAccount(String AccNum,String Holder1,String Holder2,double Balance){
        super(AccNum, Holder1, Balance);
        this.SecondHolder = Holder2;
    }
    public void AccDetails(){
        System.out.println("Joint Account Number : " + AccNumber);
        System.out.println("holder1 Name : " + HolderName);
        System.out.println("Holder2 Name : " + SecondHolder);
        System.out.println("Balance : " + Balance);
    }
}

public class BankSys1 {
    public static void main(String args[]){
        SavingsAccount s1 = new SavingsAccount("BOI1002300001","Praveen", 10000);
        CurrentAccount c1 = new CurrentAccount("CBOI3400012", "Giri",15000);
        JointAccount j1 = new JointAccount("JBOI0015600021","Ganesh","Giri", 30000);
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome to the bank Management System");
        while(true){
            System.out.println("\n Choose Your Account Type");
            System.out.println("1. Savings Account");
            System.out.println("2. Current Account");
            System.out.println("3. Joint Account");
            System.out.println("4. Exit");
            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();

            switch(choice){
                case 1 :
                System.out.println("---Savings Account---\n");
                s1.AccDetails();
                System.out.println("1. Deposit  2. Withdraw  3. Add Interest \n");
                System.out.print("Enter Choice : ");
                int sc1 = sc.nextInt();
                if(sc1 == 1){
                    System.out.print("Enter Amount : ");
                    s1.Deposit(sc.nextDouble());
                }
                else if(sc1 == 2){
                    System.out.print("Enter Amount : ");
                    s1.Withdraw(sc.nextDouble());
                }
                else if(sc1 == 3){
                    s1.addInterest();
                }
                break;

                case 2 :
                System.out.println("---Current Account---");
                c1.AccDetails();
                System.out.println("1. Deposit  2. Withdraw ");
                System.out.print("Enter choice : ");
                int sc2 = sc.nextInt();
                if(sc2 == 1){
                    System.out.print("Enter Amount : ");
                    c1.Deposit(sc.nextDouble());
                }
                else if(sc2 == 2){
                    System.out.print("Enter Amount : ");
                    c1.withdraw(sc.nextDouble());
                }
                break;

                case 3 :
                System.out.println("---Joint Account---");
                j1.AccDetails();
                System.out.println("1. Deposit  2. Withdraw ");
                System.out.print("Enter choice : ");
                int sc3 = sc.nextInt();
                if(sc3 == 1){
                    System.out.print("Enter Amount : ");
                    j1.Deposit(sc.nextDouble());
                }
                else if(sc3 == 2){
                    System.out.print("Enter Amount : ");
                    j1.Withdraw(sc.nextDouble());
                }
                break;

                case 4:
                System.out.println("Thank you for Using bank System");
                sc.close();
                return;

                default:
                System.out.println("Invalid choice! Try again");
            }
        }
    }
}
