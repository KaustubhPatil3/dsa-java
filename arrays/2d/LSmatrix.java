import java.util.*;

public class LSmatrix {

    public static void largest(int mat[][])
    {
        int large=Integer.MIN_VALUE ;

        for(int i = 0; i < mat.length; i++) 
        {
            for(int j = 0; j < mat[0].length; j++) 
            {
                    if(large<mat[i][j])
                    {
                        large=mat[i][j];
                    }
            }                    
        }
        System.out.println("Largest Number is = "+large);
    }

    public static void smallest(int mat[][]) 
    {
        int small=Integer.MAX_VALUE;

        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[0].length; j++) 
                {
                     if(small>mat[i][j])
                    {
                        small=mat[i][j];
                    }
                }
            }
        System.out.println("Smallest number is = "+small);
    }

    public static void main(String args[]) {

        int m = 3, n = 3;
        int[][] mat = new int[m][n];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter " + (m*n) + " elements:");

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        largest(mat);
        smallest(mat);
        
        sc.close();
    }
}