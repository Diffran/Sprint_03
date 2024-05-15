package tasca_02.n2exercici1.paymentMethod;

public class CreditCard implements CallbackPayment{
    static{
        System.out.println("processing credit card payment ");
    }
    @Override
    public void payment(String message, double amount) {
        System.out.println("Paid: "+ amount + " € - with Credit Card - "+ message);
    }
}
