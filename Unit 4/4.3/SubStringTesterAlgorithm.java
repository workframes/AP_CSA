public class SubStringTesterAlgorithm {
    public static void main(String[] args){
        String word = "sunflower";
        String sub = "low";
        boolean found = false;

        for(int i = 0; i <= word.length(); i++){
            String portion = word.substring(i, i + sub.length());
            if(portion.equals(sub)){
                found = true;
                break;
            }
        }

        if(found){
            System.out.println("We found the smaller String!");
        } else {
            System.out.println("We did not find the smaller String!");
        }
    }
}
