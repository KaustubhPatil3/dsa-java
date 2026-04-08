public class NQueenOneSolution 
{
    public static boolean isSafe(char c[][], int row, int col)
    {
        // vertical
        for(int i=row-1;i>=0;i--)
        {
            if(c[i][col]=='Q')
                return false;
        }

        // diagonal left
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
        {
            if(c[i][j]=='Q')
                return false;
        }

        // diagonal right
        for(int i=row-1,j=col+1;i>=0 && j<c.length;i--,j++)
        {
            if(c[i][j]=='Q')
                return false;
        }

        return true;
    }

    public static boolean find(char c[][], int row)
    {
        if(row == c.length)
        {
            printBoard(c);
            return true; 
        }

        for(int j=0;j<c.length;j++)
        {
            if(isSafe(c,row,j))
            {
                c[row][j]='Q';

                if(find(c,row+1)) 
                    return true;
                else
                c[row][j]='X'; 
            }
        }

        return false;
    }

    public static void printBoard(char c[][])
    {
        System.out.println("--------CHESS BOARD---------");
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c.length;j++)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        int n=4;
        char Q[][]=new char[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                Q[i][j]='X';
            }
        }

        find(Q,0);
    }
}