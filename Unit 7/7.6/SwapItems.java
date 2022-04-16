public class SwapItems {
    public void swapItems(int firstIndex, int secondIndex, Object[] arrayOfStuff){
        Object thirdHand = arrayOfStuff[firstIndex];
        arrayOfStuff[firstIndex] = arrayOfStuff[secondIndex];
        arrayOfStuff[secondIndex] = thirdHand;
    }
}

