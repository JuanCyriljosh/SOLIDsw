package two;

public class DiscountFactory {
    public static DiscountStrategy getDiscount(String type) {
        
        if (type.equalsIgnoreCase("student")) {
            return new StudentDiscount();
        } else if (type.equalsIgnoreCase("senior citizen")) {
            return new SeniorDiscount();
        } else {
            return new RegularDiscount();
        }
    }
}
