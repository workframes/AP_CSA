public class proccessWordsQuestion {
    public void proccessWords(String word1, String word2){
        String str1 = word1.substring(0, 2);
        String str2 = word2.substring(word2.length() - 1);
        String result = str2 + str1;
        System.out.println(result.indexOf(str2));
    }
    public static void main(String[] args){
        proccessWordsQuestion pwq = new proccessWordsQuestion();
        pwq.proccessWords("blob", "mom");
    }
}

