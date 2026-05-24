import java.util.*;

public class ActivitySelection 
{
    public static void main(String[] args)
    {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[]   = {2, 4, 6, 7, 9, 9};
        int n = end.length;

        ArrayList<int[]> activities = new ArrayList<>();

        for (int i = 0; i < n; i++) 
        {
            activities.add(new int[]{start[i], end[i]});
        }

        activities.sort((a, b) -> a[1] - b[1]);

        int count = 1;
        int lastEnd = activities.get(0)[1];

        for (int i = 1; i < activities.size(); i++) 
        {
            if (activities.get(i)[0] >= lastEnd) 
            {
                count++;
                lastEnd = activities.get(i)[1];
            }
        }
        System.out.println("Max Activities: " + count);
    }
}