public class NestedLoops3 {
    public static void main(String[] args){
        for(int outer = 4; outer >= 1; outer--){
            for(int inner = outer; inner > 0; inner--){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}


