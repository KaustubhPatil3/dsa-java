import java.util.*;

public class searchMatrix {

    public static void search(int mat[][], int key) {
        boolean found = false;

        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[0].length; j++) {

                if(mat[i][j] == key) {
                    System.out.println("Key found at position: (" + i + "," + j + ")");
                    found = true;
                }
            }
        }

        if(!found) {
            System.out.println("Key not found");
        }
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

        System.out.print("Enter key: ");
        int key = sc.nextInt();

        search(mat, key);

        sc.close();
    }
}