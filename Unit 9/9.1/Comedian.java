import java.util.ArrayList;

public class Comedian extends Performer {
    private ArrayList<String> jokes = new ArrayList<String>();
    
    public Comedian(String name, int age, String hometown, String agent) {
        super(name, age, hometown, agent);
    }

    public Comedian(){
        
    }

    public boolean writeJokes(String Joke){
        return jokes.add(Joke);
    }

    public void perform() {
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}

