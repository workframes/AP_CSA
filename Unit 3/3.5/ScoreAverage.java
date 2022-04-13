public class ScoreAverage {
    public static void main(String[] args){
        double sumOfScores = 0.0;
        int numberOfScores = 0;

        if(numberOfScores > 0 && sumOfScores/numberOfScores >= 90.00){
            System.out.println("You have a high average!");
        } else {
            System.out.println("You have a low average.");
        }
    }
}
