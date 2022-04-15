public class LogicErrors {
    public static void incrementParam(int a){
        a++;
        System.out.println(a);
    }

    public static void main(String[] args) {
        int x = 33;
        incrementParam(x);
        System.out.println(x);
    }
}
