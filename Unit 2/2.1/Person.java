/*
* Purpose: Define a person object
*/

public class Person{
    private String name;
    private int age;
    private boolean isAdult;

    public Person(String nm, int ag, boolean ad){
        name = nm;
        age = ag;
        isAdult = ad;
    }

    public void increaseAge(){
        age++;
    }
}