public class Table implements Furniture {
    private final double weight;
    private final double size;
    private final int quantity;

    public Table(double weight, double size, int quantity) {
        this.weight = weight;
        this.size = size;
        this.quantity = quantity;
    }

    public double getWeight() {
        return weight;
    }

    public double getSize() {
        return size;
    }

    public int getQuantity() {
        return quantity;
    }


    @Override
    public double accept(ShippingCostCalculator visitor) {
        return visitor.calculateForTable(this);
    }
}
