public class Marker extends WritingUtensil {
    private String tipType;

    public Marker(int pixels, String type){
        super(pixels);
        tipType = type;
    }

    public String toString(){
        return super.toString() + "\n tipType = " + tipType;
    }

    public boolean equals(Object other){
        if(!(other instanceof Marker))
            return false;

        Marker that = (Marker)other;
        return this.tipType.equals(that.tipType);
    }
}

