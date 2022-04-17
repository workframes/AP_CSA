public class InsuredShippingItem extends ShippingItem{
    private double insuredAmt;

    public InsuredShippingItem(double w, double amt) {
        super(w);
        insuredAmt = amt;
    }

    public double getCost(){
        return super.getCost() + insuredAmt;
    }
}
