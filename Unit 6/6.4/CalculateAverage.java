public class CalculateAverage {
    private double calculateAverage(int [] values){
        double average = 0.0;

        for (int value : values){
            average += value;
        }

        return average / values.length;
    }

    public static void main(String[] args){
        CalculateAverage ca = new CalculateAverage();
        int [] values = {14, 523, 7685, -123, 370};

        System.out.println("Average: " + ca.calculateAverage(values));
    }
}
