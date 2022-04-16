public class LeftShiftingArrays {
    public static void main(String[] args){
        String [] words = {"alpha", "beta", "gamma", "delta"};
        int shiftWord = 2;

        for(int count = 0; count < shiftWord; count++){
            String temp = words[0];
            for(int index = 0; index < words.length - 1; index++){
                words[index] = words[index + 1];
            }
            words[words.length - 1] = temp;
        }

        for (String word : words){
            System.out.print(word + " ");
        }
    }
}

