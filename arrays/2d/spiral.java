public class spiral 
{
    public static void showSpiral(int mat[][])
    {
        
        int startRow=0;
        int startCol=0;
        int endRow=mat.length-1;
        int endcol=mat[0].length-1;

        while(startRow<=endRow && startCol<=endcol)
        {
            //TOP - 
            for(int j=startCol;j<=endcol;j++)
            {
                System.out.print(" "+mat[startRow][j]);
            }

            //RIGHT - 
            for(int i=startRow+1;i<=endRow;i++)
            {
                    System.out.print(" "+mat[i][endcol]);
            }

            //Bottom
            for(int j=endcol-1;j>=startCol;j--)
            {
                if(startRow==endRow)
                { break; }
                System.out.print(" "+mat[endRow][j]);
            }

            //LEFT
            for(int i=endRow-1;i>=startRow+1;i--)
            {
                if(startCol==endcol)
                {  break; }
                System.out.print(" "+mat[i][startCol]);
            }
            startRow++;
            startCol++;
            endRow--;
            endcol--; 
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int mat[][]={{1,2,3},
                     {5,6,7},
                     {9,10,11}};

        System.out.println("Spiral matrix = ");

       showSpiral(mat);
    }
}
