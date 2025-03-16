public class Sofa implements Furniture {
    private final double distance;
    private final double volume;
    private final int quantity;

    public Sofa(double distance, double volume, int quantity) {
        this.distance = distance;
        this.volume = volume;
        this.quantity = quantity;
    }

    public double getDistance() {
        return distance;
    }

    public double getVolume() {
        return volume;
    }

    public int getQuantity() {
        return quantity;
    }


    @Override
    public double accept(ShippingCostCalculator visitor) {
        return visitor.calculateForSofa(this);
    }
}
