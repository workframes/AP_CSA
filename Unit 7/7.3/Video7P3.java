import java.util.ArrayList;

public class Video7P3 {
    public static void main(String[] args){
        ArrayList<Double> grades = new ArrayList<Double>();
        grades.add(81.3);
        grades.add(97.5);
        grades.add(65.8);
        grades.add(100.0);
        grades.add(90.0);
        grades.add(44.3);

        System.out.println("Original Grades:");
        for(double score : grades){
            System.out.print(score + " ");
        }

        System.out.println("\nUpdating Grades:");
        for(double score : grades){
            if(score < 70){
                score = 70;
            }

            System.out.print(score + " ");
        }

        System.out.println("\nVerification of grades");
        for(double score : grades){
            System.out.print(score + " ");
        }
    }
}
