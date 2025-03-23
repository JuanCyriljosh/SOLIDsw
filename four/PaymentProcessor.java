package four;

import java.util.Map;

public class PaymentProcessor {
    private final Map<String, PaymentMethod> paymentMethods;

    public PaymentProcessor(Map<String, PaymentMethod> paymentMethods) {
        if (paymentMethods == null || paymentMethods.isEmpty()) {
            throw new IllegalArgumentException("Payment methods cannot be null or empty.");
        }
        this.paymentMethods = paymentMethods;
    }

    public void processPayment(Order order) {
        PaymentMethod method = paymentMethods.get(order.getPaymentMethod());
        if (method == null) {
            throw new IllegalArgumentException("Unsupported payment method: " + order.getPaymentMethod());
        }
        method.pay(order.getAmount());
    }
}
