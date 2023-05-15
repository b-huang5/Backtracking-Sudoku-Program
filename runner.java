
/**
 * Write a description of class runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class runner
{
    public static void main(String args[])
    {
        int[][] board = {{0,0,0,0,0,0,0,0,0},{0,4,0,5,0,3,0,8,0},{0,0,1,0,4,0,5,0,0},{0,0,6,2,0,7,4,0,0},{0,0,0,0,9,0,0,0,0},{0,5,9,4,0,1,8,7,0},
        {0,9,0,0,3,0,0,2,0},{0,7,0,0,0,0,0,5,0},{5,2,3,0,0,0,6,4,7}};
        //int[][] board = {{0,3,0},{0,2,3},{0,0,2}};
        Sudoku a = new Sudoku();
        a.solve(0, 0, board);
    }
}
