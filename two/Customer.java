package two;

public class Customer {
    private String name;
    private DiscountStrategy discount;
    private double purchaseAmount;
  
    public Customer(String name, String discountType, double purchaseAmount) {
        this.name = name;
        this.purchaseAmount = purchaseAmount;
        this.discount = DiscountFactory.getDiscount(discountType);
    }

    public double getPurchaseAmount() {
        return purchaseAmount;
    }

    public double computeDiscount() {
        return discount.calculate(purchaseAmount);
    }

    public double getFinalPrice() {
        return purchaseAmount - computeDiscount();
    }
}
