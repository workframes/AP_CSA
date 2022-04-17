public class MyAPCSACLassRocks {
    public static void main(String[] args){
        String[][] arr = {
            {"My", "A"},
            {"AP", "Class"},
            {"CS", "Rocks!"}
        };

        for(int col = 0; col < arr[0].length; col++){
            for(int row = 0; row < arr.length; row++){
                System.out.print(arr[row][col] + " ");
            }
        }
    }
}


