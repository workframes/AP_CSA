import java.util.ArrayList;

public class FindMaxValue {
    public static void main(String[] args){
        FindMaxValue f = new FindMaxValue();
        ArrayList<Double> myList = new ArrayList<Double>();
        myList.add(1.0);
        myList.add(2.0);
        myList.add(3.0);
        myList.add(4.0);
        myList.add(5.0);
        myList.add(6.0);
        myList.add(7.0);
        
        System.out.println(f.findMax(myList));
    }

    private double findMax(ArrayList<Double> values){
        double max = values.get(0);

        for(int index = 0; index < values.size(); index++){
            if(values.get(index) > max){
                max = values.get(index);
            }
        }

        return max;
    }
}
