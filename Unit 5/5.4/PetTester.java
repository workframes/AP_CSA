public class PetTester {
    public static void main(String[] args){
        Pet p = new Pet();
        p.setName("Bobby");
        p.setTypeOfPet("Dog");
        p.setAge(3);
        System.out.println(p.getName());
        System.out.println(p.getTypeOfPet());
        System.out.println(p.getAge());
    }
}
