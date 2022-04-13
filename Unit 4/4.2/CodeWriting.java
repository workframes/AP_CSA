public class CodeWriting {
    public static void main(String[] args){
        double balance = 200.0;
        
        for(int year = 1; year <= 50; year++){
            balance = (balance * 0.10) + balance;
            System.out.println(balance);
        }
    }
}
