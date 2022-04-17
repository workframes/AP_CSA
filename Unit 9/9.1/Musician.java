public class Musician extends Performer{
    private String instrument;

    public Musician(){
        instrument = "Piano";
    }

    public Musician(String name, int age, String hometown, String agent, String instrument){
        super(name, age, hometown, agent);
        this.instrument = instrument;
    }

    public Musician(String instrument){
        this.instrument = instrument;
    }

    public String getInstrument(){
        return instrument;
    }

    public void playInstrument(){
        System.out.println("Making music with my " + instrument + "!");
    }
}
