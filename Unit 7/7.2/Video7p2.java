import java.util.ArrayList;

public class Video7p2 {
    public static void main(String[] args){
        ArrayList<Boolean> questions = new ArrayList<Boolean>();
        questions.add(true);
        myMethod(questions);
        
    }

    public static void myMethod(ArrayList<Boolean> arr){
        if(arr.size() > 0){
            System.out.println(arr.get(0));
        }
    }
}
