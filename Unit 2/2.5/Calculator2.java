public class Calculator2 {
    public double calcAverage(int num1, double num2){
        double average = (num1 + num2) / 2;
        return average;
    }

    public double calcAverage(int num1, int num2, double num3){
        double average = (num1 + num2 + num3) / 2;
        return average;
    }

    public static void main(String[] args){
        Calculator2 newAverage = new Calculator2();
        System.out.print("The average of 20 and 15.4 is ");
        System.out.println(newAverage.calcAverage(20, 15.4));
        System.out.print("The average of 5, 8 , and 6.4 is ");
        System.out.println(newAverage.calcAverage(5, 8, 6.4));
    }
}
