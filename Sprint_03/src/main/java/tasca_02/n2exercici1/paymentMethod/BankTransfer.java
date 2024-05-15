package tasca_02.n2exercici1.paymentMethod;

public class BankTransfer implements CallbackPayment{
    static{
        System.out.println("processing Bank Payment ");
    }
    @Override
    public void payment(String paymentMethod) {


    }
}
