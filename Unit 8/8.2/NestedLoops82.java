public class NestedLoops82 {
    public static void main(String[] args){
        for(int outer = 1; outer < 5; outer++){
            for(int inner = 1; inner < 3; inner++){
                System.out.print(inner + " ");
            }
            System.out.println();
        }
    }
}
