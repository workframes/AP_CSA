import java.util.ArrayList;

public class FoodTester {
    public static void main(String[] args){
        ArrayList<Food> Foods = new ArrayList<Food>();

        Foods.add(new Food("Lasagna"));
        Foods.add(new QuickPrepFood("Pizza", 5));
    }
}
