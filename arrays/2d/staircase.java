import java.util.*;

public class staircase {

    public static boolean search(int mat[][], int key) 
    {

        int row = 0;
        int col = mat[0].length - 1;

        while(row < mat.length && col >= 0) {

            if(mat[row][col] == key) {
                System.out.println("Found at (" + row + "," + col + ")");
                return true;
            }
            else if(key < mat[row][col]) {
                col--; // move left
            }
            else {
                row++; // move down
            }
        }

        System.out.println("Key not found");
        return false;
    }

    public static void main(String args[]) {

        int mat[][] = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17}
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key: ");
        int key = sc.nextInt();

        search(mat, key);

        sc.close();
    }
}