import java.util.Arrays;

public class FractionalKnapsack 
{

    static class Item implements Comparable<Item> 
    {
        int value, weight;
        double ratio;

        Item(int value, int weight) 
        {
            this.value = value;
            this.weight = weight;
            this.ratio = (double) value / weight;
        }

        @Override
        public int compareTo(Item other)
        {
            return Double.compare(other.ratio, this.ratio);
        }
    }

    static double fractionalKnapsack(int[] values, int[] weights, int capacity) {
        int n = values.length;
        Item[] items = new Item[n];

        for (int i = 0; i < n; i++) {
            items[i] = new Item(values[i], weights[i]);
        }

        Arrays.sort(items);

        double totalValue = 0;
        int remainingCapacity = capacity;

        for (Item item : items) {
            if (remainingCapacity == 0) break;

            if (item.weight <= remainingCapacity) {
                totalValue += item.value;
                remainingCapacity -= item.weight;
            } else {
                totalValue += item.ratio * remainingCapacity;
                remainingCapacity = 0;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        int[] values  = {60, 100, 120};
        int[] weights = {10,  20,  30};
        int capacity  = 50;

        double maxValue = fractionalKnapsack(values, weights, capacity);
        System.out.println("Maximum value = " + maxValue);
    }
}