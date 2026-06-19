class Paymentgateway
{
public void processPayment(double amount)
{
System.out.println("Processing generic payment of + amount);
}
}
class Creditpayment extends Paymentgateway
{
@Override
public void processPayment(double amount)
{
System.out.println("Processing Credit card payment of + amount + "via Stripe");
}
}
class Upipayment extends Paymentgateway
{
public void processPayment(double amount)
{
System.out.println("Processing Upi payment of + amount + "via Razopay");
}
}
public class Poly 
{
public static void main(String[] args)
{
Paymentgateway paymeny;
payment = new Creditcardpayment();
payment.processPayment(1500.0);

payment=new upipayment();
payment.processPayment(500.0);
}
}