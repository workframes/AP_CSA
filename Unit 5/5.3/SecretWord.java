public class SecretWord {
    private String word;

    public SecretWord(String w){
        word = w;
    }

    /**
     * Precondition: Parameter num is less than the lenght of word
     * Postcondition: Returns the string of the character of word from
     *                index num to the end of word followed by the
     *                Character of word from index 0 to num, not including
     *                index num. The state of word is not changed.
     */

    public String newWord(int num){
        String first = word.substring(num);
        String second = word.substring(0, num);
        return first + second;
    }
}
