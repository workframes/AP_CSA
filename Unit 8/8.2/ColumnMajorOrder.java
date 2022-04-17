public class ColumnMajorOrder{
    public static void printArray(String[][] grid){
        for(int col = 0; col < grid[0].length; col++){
            for(int row = 0; row < grid.length; row++){
                System.out.print(grid[row][col]);
            }
        }
    }

    public static void main(String[] args){
        String[][] grid = {
            {"A", "B", "C", "D", "E"},
            {"F", "G", "H", "I", "J"},
            {"K", "L", "M", "N", "O"},
            {"P", "Q", "R", "S", "T"},
            {"U", "V", "W", "X", "Y"}
        };

        printArray(grid);
    }
}