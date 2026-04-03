public class even_odd{
    public static void main(String args[]) {
        int n = 7;

        if((n & 1) == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}