/*
* Purpose: Demonstrate literals and expressions.
*/

public class ExpressionDemo3 {
    public static void main(String[] args){
        int x = 3;
        int y = 2;

        System.out.println(8 * 6 - 14 % x + 8 / y);
        System.out.println(8 * 6 - 14 % (x + 8) / y);
    }
}
