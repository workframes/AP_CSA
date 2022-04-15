public class Sport {
    private String name;
    private int numAthletes;

    public Sport() {
        name = "";
        numAthletes = 0;
    }

    public Sport(String n, int a) {
        name = n;
        numAthletes = a;
    }

    public Sport(String n){
        name = n;
        numAthletes = 0;
    }

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }
    
    public int getNumAthletes(){
        return numAthletes;
    }

    public String toString(){
        return "Sport: " + name + "\n Number of Athletes: " + numAthletes;
    }
}
