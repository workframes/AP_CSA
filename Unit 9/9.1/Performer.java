public class Performer {
    private String name;
    private int age;
    private String hometown;
    private String agent;

    public Performer(){
        name = "Ima Performer";
        age = 0;
        hometown = "";
        agent = "";
    }

    public Performer(String name, int age, String hometown, String agent){
        this.name = name;
        this.age = age;
        this.hometown = hometown;
        this.agent = agent;
    }

    public String getName(){
        return name;
    }

    public void practice(){
        System.out.println("Honing my craft!");
    }

    public void perform(){
        System.out.println("Performing for an audience!");
    }
}



