package two;

public class SeniorDiscount implements DiscountStrategy {
    
    @Override
    public double calculate(double amount) {
        return amount * 0.10;
    }
}
