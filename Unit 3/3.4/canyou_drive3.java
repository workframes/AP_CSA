public class canyou_drive3 {
    public static void main(String[] args){
        int myAge = 18;
        System.out.println("Current age: " + myAge);

        if(myAge >= 18){
            System.out.println("You can resiger to vote.");
            System.out.println("You are old enough for a license to drive.");
        } else if(myAge >= 16){
            System.out.println("You are old enough for license to drive.");
        } else if(myAge >= 15){
            System.out.println("You are not old enough to learn to drive.");
        } else if(myAge == 14){
            System.out.println("You are 14.");
        }
    }
}
