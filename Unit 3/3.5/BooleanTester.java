public class BooleanTester {
    public static void main(String[] args){
        boolean partyHasCake = true;
        boolean partHasIceCream = true;

        if(partyHasCake && partHasIceCream){
            System.out.println("This is a GREAT party!");
        }
        else{
            System.out.println("Let's stay home.");
        }

        if(!partHasIceCream){
            System.out.println("I don't like cake anyways.");
        }
        else{
            System.out.println("Let them eat cake!");
        }
    }
}
