public class Mutable {
    private int value;
    
    public Mutable(int v){
        value = v;
    }

    public void incrementValue(){
        value++;
    }

    public int getValue(){
        return value;
    }
}
