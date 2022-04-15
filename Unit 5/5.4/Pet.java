public class Pet {
    private String name;
    private String typeOfPet;
    private int age;

    public Pet() {
        name = "";
        typeOfPet = "";
        age = 0;
    }

    public Pet(String n, String t, int a) {
        name = n;
        typeOfPet = t;
        age = a;
    }

    public String getName() {
        return name;
    }

    public String getTypeOfPet() {
        return typeOfPet;
    }

    public int getAge() {
        return age;
    }

    public void setName(String n) {
        name = n;
    }

    public void setTypeOfPet(String t) {
        typeOfPet = t;
    }

    public void setAge(int a) {
        age = a;
    }
}
