package four;

import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Map<String, PaymentMethod> paymentMethods = new HashMap<>();
        paymentMethods.put("ewallet", new EWallet());
        paymentMethods.put("cash", new Cash());
        paymentMethods.put("creditcard", new CreditCard());

        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentMethods);

        Order order1 = new Order("Order1", 500.00, "ewallet");
        Order order2 = new Order("Order2", 200.00, "cash");
        Order order3 = new Order("Order3", 1000.00, "creditcard");

        paymentProcessor.processPayment(order1);
        paymentProcessor.processPayment(order2);
        paymentProcessor.processPayment(order3);
    }
}
