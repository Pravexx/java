public class PaymentGatwaySystem {
    public static void main(String[] args) {
        CreditCardPayment C1 = new CreditCardPayment();
        C1.processPayment(2000);

        UpiPayment U1 = new UpiPayment();
        U1.processPayment(3000);

        WalletPayment W1 = new WalletPayment();
        W1.processPayment(5000);
    }
}

interface Payment{
    void processPayment(double amount);
}

class CreditCardPayment implements Payment{
    public void processPayment(double amount){
        double ServiceCharge = amount*0.02;
        double TotalAmount = amount + ServiceCharge;
        System.out.println("Credit Card payments processing...");
        System.out.println("CreditCard Service Charge : " + ServiceCharge);
        System.out.println("CreditCard FinalAmount : " + TotalAmount);
        System.out.println("Payment Success via creditCard!\n");
    }
}
class UpiPayment implements Payment{
    public void processPayment(double amount){
        double Cashback = amount * 0.01;
        System.out.println("Processing UPI Payment...");
        System.out.println("Amount: ₹" + amount);
        System.out.println("Cashback Earned (1%): ₹" + Cashback);
        System.out.println("Payment Successful via UPI!\n");

    }
}

class WalletPayment implements Payment{
    public void processPayment(double amount){
        double Walletdiscount = 20.0;
        double FinalAmount =  (Walletdiscount<amount ? amount - Walletdiscount:0);
        System.out.println("Processing Wallet Payment...");
        System.out.println("Original Amount: ₹" + amount);
        System.out.println("Wallet Discount: ₹" + Walletdiscount);
        System.out.println("Final Amount Deducted: ₹" + FinalAmount);
        System.out.println("Payment Successful via Wallet!\n");
    }
}
