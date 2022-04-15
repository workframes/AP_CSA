public class AnimalTester {
    public static void main(String[] args){
        Animal one = new Animal("zebra", 4);
        Animal two = new Animal("ekeohant", 7);

        // Update each animal object's age by 1
        one.setAge(one.getAge() + 1);
        two.setAge(8);
    }
}
