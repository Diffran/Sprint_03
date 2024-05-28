package tasca_02.n2exercici1.paymentMethod;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class PaymentGateway {
    private static Random r = new Random();
    private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    private static boolean paymentSuccess;
    public void processPayment(CallbackPayment callbackPayment, double amount){
        int delay = r.nextInt(4);
        System.out.println("payment will process in ... "+delay+" seconds");

        scheduler.schedule(() -> {
            paymentSuccess = r.nextBoolean();
            if (paymentSuccess) {
                callbackPayment.payment("Successful Payment!!", amount);
            } else {
                callbackPayment.payment("Payment Failed!!", amount);
            }
        }, delay, TimeUnit.SECONDS);
    }
}
