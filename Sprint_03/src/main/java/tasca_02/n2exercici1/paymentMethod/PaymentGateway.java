package tasca_02.n2exercici1.paymentMethod;

import java.util.Random;

public class PaymentGateway {
    private static Random r = new Random();
    private static boolean paymentSuccess;
    public void processPayment(CallbackPayment callbackPayment, double amount){
        paymentSuccess = r.nextBoolean();
        if(paymentSuccess){
            callbackPayment.payment("Successfull Payment!!", amount);
        }else{
            callbackPayment.payment("Payment Failed!!", amount);
        }
    }
}
