package tasca_02.n2exercici1.paymentMethod;

public enum PaymentType {
    PAYPAL("PayPal"),
    CREDITCARD("creditCard"),
    BANKACCOUNT("bank account debit");

    private final String type;
    PaymentType(String type) {
        this.type=type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "PaymentType{" +
                "type='" + type + '\'' +
                '}';
    }
}
