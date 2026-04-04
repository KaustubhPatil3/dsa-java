class Bank {
    private int balance = 1000;

    void deposit(int amt) {
        balance += amt;
    }

    int getBalance() {
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.deposit(500);
        System.out.println(b.getBalance());
    }
}