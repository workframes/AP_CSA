public class ShippingItem {
    private double weight;
    private static double COST_PER_OZ = 1.5;

    public ShippingItem(double w) {
        weight = w;
    }

    public double getCost(){
        return weight * COST_PER_OZ;
    }
}
