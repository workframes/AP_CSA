public class Animal{
    private String typeOfAnimal;
    private int age;

    public Animal(String t, int a){
        typeOfAnimal = t;
        age = a;
    }

    public void setTypeOfAnimal(String t){
        typeOfAnimal = t;
    }

    public void setAge(int a){
        age = a;
    }

    public String getTypeOfAnimal(){
        return typeOfAnimal;
    }

    public int getAge(){
        return age;
    }
}