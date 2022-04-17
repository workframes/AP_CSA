public class Dancer extends Performer{
    private int shoeSize;

    public Dancer(int shoeS){
        this.shoeSize = shoeS;
    }

    public Dancer(String name, int age, String hometown, String agent, int shoeS){
        super(name, age, hometown, agent);
        this.shoeSize = shoeS;
    }

    public void perform(){
        System.out.println("Dancing!");
    }

    public void selectMusic(){
        
    }
}
