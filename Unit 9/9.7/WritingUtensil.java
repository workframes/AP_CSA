public class WritingUtensil {
    private int tipSize;

    public WritingUtensil(int pixels){
        tipSize = pixels;
    }

    public String toString(){
        return "topSize = " + tipSize;
    }

    public boolean equals(Object other){
        if(!(other instanceof WritingUtensil))
            return false;
        
        WritingUtensil that = (WritingUtensil)other;
        return this.tipSize == that.tipSize;
    }
}
