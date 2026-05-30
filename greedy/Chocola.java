import java.util.*;

public class Chocola {
    
    public static int minCost(int[] horizontal, int[] vertical)
    {
        Arrays.sort(horizontal);
        Arrays.sort(vertical);
        
        int hLength = horizontal.length;
        int vLength = vertical.length;
        
        int horizontalPieces = 1;
        int verticalPieces = 1;
        
        int cost = 0;
        int h = hLength - 1;
        int v = vLength - 1;
        
        while (h >= 0 && v >= 0) {
            if (horizontal[h] >= vertical[v]) 
            {
                cost += horizontal[h] * verticalPieces;
                horizontalPieces++;
                h--;
            }
            else 
            {
                cost += vertical[v] * horizontalPieces;
                verticalPieces++;
                v--;
            }
        }
        
        while (h >= 0) 
        {
            cost += horizontal[h] * verticalPieces;
            h--;
        }
        
        while (v >= 0)
        {
            cost += vertical[v] * horizontalPieces;
            v--;
        }
        
        return cost;
    }
    
    public static void main(String[] args) {
        int[] horizontal = {2, 1, 3, 1, 4};
        int[] vertical = {4, 1, 2};
        
        System.out.println(minCost(horizontal, vertical));
    }
}