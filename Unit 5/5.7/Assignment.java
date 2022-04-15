public class Assignment {
    private static int nextClassworkID = 1;
    private static int nextHomeworkID = 1;
    private String name;
    private int pointValue;

    public Assignment(String type, int pV){
        pointValue = pV;
        if(type.equals("classwork")){
            name = type + " " + nextClassworkID;
            nextClassworkID++;
        }
        else {
            name = type + " " + nextHomeworkID;
            nextHomeworkID++;
        }
    }

    public double getGrade(int score){
        return (double) score / pointValue;
    }

    public static int getTotalNumAssignments(){
        return nextClassworkID + nextHomeworkID - 2;
    }
}
