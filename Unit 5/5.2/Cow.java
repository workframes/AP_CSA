public class Cow {
    private String type;
    private String sound;
    private int numMilkings;

    public Cow() {
        type = "";
        sound = "";
        numMilkings = 0;
    }

    public Cow(String t, String s) {
        type = t;
        sound = s;
        numMilkings = 0;
    }

    public String getType() {
        return type;
    }

    public String getSound() {
        return sound;
    }

    public int getNumMilkings() {
        return numMilkings;
    }

    public void milkCow(){
        numMilkings++;
    }
}
