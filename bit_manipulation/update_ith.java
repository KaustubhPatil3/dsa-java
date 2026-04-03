public class update_ith {
    public static int updateBit(int n, int i, int newBit) {
        // clear ith bit
        n = n & (~(1 << i));

        // set new bit
        return n | (newBit << i);
    }

    public static void main(String args[]) {
        System.out.println(updateBit(10, 1, 1));
    }
}