public class Chair implements Furniture {
    private final double weight;
    private final int quantity;
    
    public Chair(double weight, int quantity) {
        this.weight = weight;
        this.quantity = quantity;
    }
    public double getWeight() {
        return weight;
    }
    public int getQuantity() {
        return quantity;
    }

    @Override
    public double accept(ShippingCostCalculator visitor) {
        return visitor.calculateForChair(this);
    }
}
