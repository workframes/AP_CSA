public class InformalCodeAnalysis {
    public static void main(String[] args){
        int count = 0;
        for(int k = 0; k < 30; k++){
            if(k % 3 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
