public class ShippingCostVisitor implements ShippingCostCalculator {
    @Override
    public double calculateForChair(Chair chair) {
        return 10.0 * chair.getQuantity();
    }

    @Override
    public double calculateForTable(Table table) {
        return table.getQuantity() * (5.0 * table.getWeight() + 2.0 * table.getSize());
    }

    @Override
    public double calculateForSofa(Sofa sofa) {
        return sofa.getQuantity() * (1.5 * sofa.getDistance() + 10.0 * sofa.getVolume());
    }
}
