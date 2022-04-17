public class PerformerDebugger {
    public static void main(String[] args) {
        Performer p = new Performer("John", 30, "New York", "Agent");
        System.out.println(p.getName());
        p.practice();
        p.perform();
        System.out.println();
        
        Musician m = new Musician("Bob", 30, "New York", "Agent", "Guitar");
        System.out.println(m.getName());
        p.practice();
        m.playInstrument();
        m.perform();
        System.out.println();

        Comedian c = new Comedian("Sally", 30, "New York", "Agent");
        System.out.println(c.getName());
        p.practice();
        c.writeJokes("Why did the chicken cross the road?");
        c.perform();
        System.out.println();

        Comedian c2= new Comedian();
        c2.perform();
        System.out.println();
    }
}
