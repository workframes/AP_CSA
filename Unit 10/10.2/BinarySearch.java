public class BinarySearch {
    public static int binarySearch(int[] intArray, int lowPosition, int hightPosition, int target){
        int midPosition;

        while (lowPosition <= hightPosition){
            midPosition = (lowPosition + hightPosition) / 2;

            if(intArray[midPosition] < target){
                lowPosition = midPosition + 1;
            } else if(intArray[midPosition] > target){
                hightPosition = midPosition - 1;
            } else {
                return midPosition;
            }
        }

        return -1;
    }

    public static int binarySearch2(int[] intArray, int lowPosition, int hightPosition, int target){
        int midPosition;

        midPosition = (lowPosition + hightPosition) / 2;

        if(intArray[midPosition] < target){
            lowPosition = midPosition + 1;
            return binarySearch2(intArray, lowPosition, hightPosition, target);
        } else if(intArray[midPosition] > target){
            hightPosition = midPosition - 1;
            return binarySearch2(intArray, lowPosition, hightPosition, target);
        } else {
            return midPosition;
        } 
    }

    public static void main(String[] args){
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;

        System.out.println(binarySearch(intArray, 0, intArray.length - 1, target));
        System.out.println(binarySearch2(intArray, 0, intArray.length - 1, target));
    }
}
