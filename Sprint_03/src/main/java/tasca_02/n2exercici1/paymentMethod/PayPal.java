package tasca_02.n2exercici1.paymentMethod;

public class PayPal implements CallbackPayment{
    static{
        System.out.println("processing Paypal payment... ");
    }
    @Override
    public void payment(String message, double amount) {
        System.out.println("Paid: "+ amount + " € - with Paypal - "+ message);
    }
}
