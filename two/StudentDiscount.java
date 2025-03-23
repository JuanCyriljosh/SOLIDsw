package two;

public class StudentDiscount implements DiscountStrategy {
    
    @Override
    public double calculate(double amount) {
        return amount * 0.05;
    }
}
