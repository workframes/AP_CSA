public class MaxOrMinValue {
    private double findMax(double [] values){
        double max = 0.0;

        for(double value : values){
            if(value > max){
                max = value;
            }
        }

        return max;
    }

    private double findMin(double [] values){
        double min = 0.0;

        for(double value : values){
            if(value < min){
                min = value;
            }
        }

        return min;
    }

    public static void main(String[] args){
        MaxOrMinValue mmv = new MaxOrMinValue();
        double [] values = {14, 523, 7685, -123, 370};

        System.out.println("Max: " + mmv.findMax(values));
        System.out.println("Min: " + mmv.findMin(values));
    }
}
