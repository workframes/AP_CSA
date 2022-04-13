public class WhileLoop2 {
    public static void main(String[] args) {
        int number = 5384;
        int sum = 0;

        while (number > 0){
            int lastDight = number % 10;
            sum += lastDight;
            number /= 10;
        }

        System.out.println("The sum of the digits is " + sum);
    }
}