public class NestedLoops5 {
    public static void main(String[] args){
        for(int inner = 1; inner < 3; inner++){
            for(int outer = 1; outer < 5; outer++){
                System.out.println(outer + " ");
            }
            System.out.println();
        }
    }
}

