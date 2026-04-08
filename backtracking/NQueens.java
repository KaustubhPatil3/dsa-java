public class NQueens
{
    public static boolean isSafe(char c[][],int row,int col)
    {
        //vertical
        for(int i=row-1;i>=0;i--)
        {
            if(c[i][col]=='Q')
                return false;
        }

        //diagonally up right
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
        {
             if(c[i][j]=='Q')
                return false;
        }

        //diagonally up left
        for(int i=row-1,j=col+1;i>=0 &&j<c.length;i--,j++)
        {
             if(c[i][j]=='Q')
                return false;
        }

        return true;
    }

    public static void find(char c[][],int row)
    {
        if(row==c.length)
        {
            printBoard(c);
            return;
        }

        for(int j=0;j<c.length;j++)
        {
            if(isSafe(c,row,j))
            {
                c[row][j]='Q';
                find(c,row+1);
                c[row][j]='X';
            }           
        }
    }

    public static void printBoard(char c[][])
    {
        System.out.println("--------CHESS BOARD---------");
        for (int i=0;i<c.length;i++)
        {
            for (int j=0;j<c.length;j++)
            {
                System.out.print(c[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String args[])
    {
        int n=2;
        char Q[][]=new char[n][n];
        for (int i =0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                Q[i][j]='X';
            }
        }
        find(Q,0);
    }
    
}
