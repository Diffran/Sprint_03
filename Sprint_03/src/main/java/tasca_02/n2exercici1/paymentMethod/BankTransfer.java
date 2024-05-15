package tasca_02.n2exercici1.paymentMethod;

public class BankTransfer implements CallbackPayment{
    static{
        System.out.println("processing Bank Payment ");
    }
    @Override
    public void payment(String message, double amount) {
        System.out.println("Paid: "+ amount + " € - with Bank transfer - "+ message);
    }
}
