class Restaurant{
    void pay(double  amount){
        System.out.println("paid amount " + amount + "in genral Way");
    }
}
class CreditCardPay extends Restaurant{
    void pay(double  amount){
        System.out.println(amount + " Paid by Creditcard");
    }
}
class UPIpay extends Restaurant{
    void pay(double amount){
        System.out.println(amount + " Paid by UPIpay");
    }
}


public class MethodOverriding {
    public static void main(String[] args) {
        Restaurant p1 = new CreditCardPay();
        Restaurant p2 = new UPIpay();
        p1.pay(100);
        p2.pay(300);
    }
}
