public class canyou_drive {
    public static void main(String[] args){
        int myAge = 16;
        System.out.println("Current age: " + myAge);

        if(myAge >= 16){
            System.out.println("You can learn to drive a car.");
            myAge++;
        }

        System.out.println("On your next birthday, you will be " + myAge + ".");
    }
}
