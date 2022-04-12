public abstract class stringObjects2_6b {
    public static void main(String[] args){
        String name1 = "Jadon Java";
        String name2 = new String("Jessica Jave");
        String name3 = new String(name1);
        int JadAge = 17;
        int JesAge = 16;

        String Jadon = name1 + " " + JadAge;
        name2 += JesAge;

        System.out.println(Jadon);
        System.out.println(name2);
        System.out.println(name1 + " and " + name2 + " are friends.");
    }
}
