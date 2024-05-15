package tasca_02.n2exercici1.paymentMethod;

public class BankTransfer implements CallbackPayment{
    @Override
    public void payment(String paymentMethod) {
        static{
            System.out.println("processing Bank Payment ");
        }

    }
}
