public class WhereIsMyNumber {
    public int whereIsMynumber(int magicNumber, int [] myNumbers){
        for(int index = 0; index < myNumbers.length; index++){
            if(myNumbers[index] == magicNumber){
                return index;
            }
        }

        return -1;
    }
}
