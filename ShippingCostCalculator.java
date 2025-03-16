public interface ShippingCostCalculator {
    double calculateForChair(Chair chair);
    double calculateForTable(Table table);
    double calculateForSofa(Sofa sofa);
}
