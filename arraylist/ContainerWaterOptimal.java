public class ContainerWaterOptimal {
    public static void main(String args[]) {

        int height[] = {1,8,6,2,5,4,8,3,7};

        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while(left < right) {

            int h = Math.min(height[left], height[right]);
            int w = right - left;

            int water = h * w;
            maxWater = Math.max(maxWater, water);

            // move smaller height
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Maximum water = " + maxWater);
    }
}