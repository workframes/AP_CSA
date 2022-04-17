public class WritingUtensilTester {
    public static void main(String[] args){
        WritingUtensil wu = new WritingUtensil(10);
        System.out.println(wu);

        WritingUtensil wu2 = new WritingUtensil(10);
        System.out.println(wu);

        Marker m = new Marker(10, "chisel");
        System.out.println(m);

        Marker m2 = new Marker(10, "sharp");

        System.out.println(m.equals(m2));
        System.out.println(wu.equals(wu2));
    }
}
