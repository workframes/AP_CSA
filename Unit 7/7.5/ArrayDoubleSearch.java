import java.util.ArrayList;

public class ArrayDoubleSearch {
    public int where(double magicNumber, ArrayList<Double> realNumbers, double delta){
        for(int index = 0; index < realNumbers.size(); index++){
            if(Math.abs(realNumbers.get(index) - magicNumber) < delta){
                return index;
            }
        }

        return -1;
    }
}
