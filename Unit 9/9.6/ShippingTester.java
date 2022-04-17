public class ShippingTester {
    public static void main(String[] args){
        ShippingItem insItem = new InsuredShippingItem(10, 50);
        System.out.println(insItem.getCost());
    }
}
