import java.text.DecimalFormat;
public class Client {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Furniture chair = new Chair(15, 3);
        Furniture table = new Table(30, 10, 2);
        Furniture sofa = new Sofa(30, 20, 1);


        ShippingCostCalculator visitor = new ShippingCostVisitor();

        System.out.println("Chair Shipping Cost: Php " + df.format(chair.accept(visitor)));
        System.out.println("Table Shipping Cost: Php " + df.format(table.accept(visitor)));
        System.out.println("Sofa Shipping Cost: Php " + df.format(sofa.accept(visitor)));
    }
}
