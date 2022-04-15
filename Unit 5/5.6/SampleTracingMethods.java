public class SampleTracingMethods {
    private String text;

    public SampleTracingMethods(String t){
        text = t;
    }

    public boolean method1(int x, String y){
        if(text.length() + y.length() <= x){
            method2(y);
            return true;
        } else 
            return false;
    }

    public void method2(String textToAdd){
        text += textToAdd;
    }
}
