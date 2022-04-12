public class LucnhCalculator {
    public double divideBill(int numFriends, double totalBill){
        double amtPerFriend = totalBill / numFriends;
        return amtPerFriend;
    }

    public static void main(String[] args){
        LucnhCalculator newCalculator = new LucnhCalculator();
        System.out.print("Each person will have to pay ");
        System.out.println(newCalculator.divideBill(5, 100));

        System.out.print("Each person will have to pay ");
        System.out.println(newCalculator.divideBill(5, 35.56));
    }
}
