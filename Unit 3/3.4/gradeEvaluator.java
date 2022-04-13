public class gradeEvaluator {
    public static void main(String[] args){
        double myAverage = 100.00;

        System.out.println("Current average: " + myAverage);

        if(myAverage >= 90.0){
            System.out.println("You got an A.");
        } else if(myAverage >= 80.0){
            System.out.println("You got a B.");
        } else if(myAverage >= 70.0){
            System.out.println("You got a C.");
        } else if(myAverage >= 60.0){
            System.out.println("You got a D.");
        } else {
            System.out.println("You got an F.");
        }
    }
}
