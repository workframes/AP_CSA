public class NestedLoops2 {
    public static void main(String[] args){
        for(int outer = 1; outer < 5; outer++){
            for(int inner = 1; inner <= outer; inner++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}


