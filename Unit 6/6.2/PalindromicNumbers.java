public class PalindromicNumbers {
    private int [] list;

    public PalindromicNumbers(int numPalindromes, int start) {
       list = new int[numPalindromes];
       int i = 0;

       while(i < list.length){
           if(isPalindromic(start)){
               list[i] = start;
               i++;
           }
           start++;
       }
    }

    private static boolean isPalindromic(int num){
        // Not Shown
        return true;
    }

    public int sum(){
        int sum = 0;

        for (int i = 0; i < list.length; i++){
            sum += list[i];
        }

        return sum;
    }
}
