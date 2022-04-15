public class PermanentChange {
    public static void incrementParam(Mutable a){
        a.incrementValue();
    }

    public static void main(String[] args) {
        Mutable x = new Mutable(33);
        incrementParam(x);
        System.out.println(x.getValue());
    }
}
