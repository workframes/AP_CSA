public class ArrayManipulator{
    private int [] list;

    public ArrayManipulator(int numElements){
        list = new int[numElements];
    }

    public int getMiddleIndex(){
        if(list.length % 2 == 0){
            return list.length / 2 - 1;
        }

        return list.length / 2;
    }

    public double getAvg(){
        int firstElement = list[0];
        int lastElement = list[list.length - 1];
        int middleElement = list[getMiddleIndex()];

        return (firstElement + lastElement + middleElement) / 3.0;
    }
}