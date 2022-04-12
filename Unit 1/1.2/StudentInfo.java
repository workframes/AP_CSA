/*
* Purpose: Demonstrate declaring and using variables
*/

public class StudentInfo {
    public static void main(String[] args){
        String name = "Yoosuf Mohamed";

        double avgGrade;
        avgGrade = 92.6;

        final int NUMCLASSES = 4;

        boolean isEnrolled = true;

        System.out.println(name + " has " + NUMCLASSES + " classes, ");
        System.out.println("and average grade is " + avgGrade );
        System.out.println(name + " is currently ");
        System.out.print("enrolled at school: " + isEnrolled);
    }
}
