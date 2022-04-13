public class YourTurn1 {
    public static void main(String[] args){
        double balance = 200.0;

        int numOfYears = 0;
        while (balance < 1000.0){
            balance = (balance * 0.10) + balance;
            System.out.println(balance);
            numOfYears++;
        }

        System.out.println("It will take " + numOfYears + " years to reach $1000");
    }
}
