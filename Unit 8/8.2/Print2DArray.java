public class Print2DArray {
    public static void printArray(String[][] grid){
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                System.out.print(grid[row][col]);
            }
            System.out.println();
        }
    }   

    public static void main(String[] args){
        String[][] grid = {
            {"1", "2", "3"},
            {"4", "5", "6"},
            {"7", "8", "9"}
        };
        printArray(grid);
    }
}
