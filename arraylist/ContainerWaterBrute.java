public class ContainerWaterBrute {
    public static void main(String args[]) {

        int height[] = {1,8,6,2,5,4,8,3,7};

        int maxWater = 0;

        // check all pairs
        for(int i = 0; i < height.length; i++) {
            for(int j = i + 1; j < height.length; j++) {

                int h = Math.min(height[i], height[j]);
                int w = j - i;

                int water = h * w;

                maxWater = Math.max(maxWater, water);
            }
        }

        System.out.println("Maximum water = " + maxWater);
    }
}