public class GradePrinter {

    public void printInfo(String name, double grade){
        System.out.println(name + " has a graade of " + grade);
    }

    public static void main(String[] args){
        GradePrinter newGrade = new GradePrinter();
        newGrade.printInfo("John", 90.5);
    }

}
