
/**
 * Write a description of class Sudoku here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sudoku
{
    int[][] board;
    public Sudoku()
    {
    }

    public boolean uniqueRow(int col, int row, int[][]b)
    {
        for(int i = 0; i < b[row].length; i++)
        {
            if((b[row][i] == b[row][col]) && (!(col == i)))
            {
                return false;
            }
        }
        return true;
    }

    public boolean uniqueColumn(int col, int row, int[][]b)
    {
        for(int i = 0; i < b.length; i++)
        {
            if((b[i][col] == b[row][col]) && (!(row == i)))
            {
                return false;
            }
        }
        return true;
    }

    public boolean valid(int col, int row, int[][] b)
    {
        if(uniqueColumn(col, row, b) && uniqueRow(col, row, b))
        {
            return true;
        }
        return false;
    }

    public boolean solve(int col, int row, int[][] b)
    {
        board = b;
        if(row == board.length - 1 && col == board[row].length)
        {
            for(int i = 0; i < board.length; i++)
            {
                for(int k = 0; k < board[row].length; k++)
                {
                    System.out.print(board[i][k] + ", ");
                }
                System.out.println("");
            }
            return true;
        }
        if(board[row].length == col)
        {
            return solve(0, row + 1, board);
        }
        if(board[row][col] != 0)
        {
            return solve(col + 1, row, board);
        }
        for(int value = 1; value <= board[row].length; value++)
        {
            board[row][col] = value;
            if(valid(col, row, board))
            {
                if(solve(col + 1, row, board))
                {
                    return true;
                }
            }
        }
        board[row][col] = 0;
        return false;
    }
}
