import java.util.ArrayList;

public class Practice2 {
    public static void main(String[] args) {
        Practice2 p = new Practice2();
        ArrayList<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Mary");
        names.add("Bob");
        names.add("Jane");
        names.add("Tom");
        names.add("Jack");
        names.add("Sue");
        names.add("Joe");

        p.display(names);

    }

    public static void display(ArrayList<String> myList){
        for (String s : myList) {
            System.out.print(s + " ");
        }
    }
}
