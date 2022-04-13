public class NestedIfTester {
    public static void main(String[] args){
        int number = 36;

        if(number > 20){
            if(number%6 == 0){
                System.out.println("number is greater than 20 and divisible by 6");
            }else{
                System.out.println("number is greater than 20 and NOT divisible by 6");
            }
        } else {
            System.out.println("number is NOT greater than 20");
        }
    }
}
