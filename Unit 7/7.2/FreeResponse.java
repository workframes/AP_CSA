import java.util.ArrayList;

public class FreeResponse {
    public ArrayList<String> getDelimitersList(String[] tokens){
        String openDel = "<q>";
        String closeDel = "</q>";
        ArrayList<String> d = new ArrayList<String>();
        
        for(String str: tokens){
            if(str.equals(openDel) || str.equals(closeDel)){
                d.add(str);
            }
        }

        return d;
    }
}
