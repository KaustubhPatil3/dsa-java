public class BinaryString {

    public static void printBin(int n, int last, String str) {
        if (n == 0) {   // base case
            System.out.println(str);
            return;
        }

        // place 0
        printBin(n - 1, 0, str + "0");

        // place 1 (only if last was 0)
        if (last == 0) {
            printBin(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        int n = 3;
        printBin(n, 0, "");
    }
}