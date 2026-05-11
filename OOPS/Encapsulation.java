public class Encapsulation {

    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
       // ba.balance = 9000.000;
        
       // System.out.println(ba.balance);
       ba.creditBalance(500);
       ba.debitBalance(300);
    
        System.out.println(ba.getBalance());
    }
}

class BankAccount {
    private double balance;

    // behaviours
    public void creditBalance(int amount) {
        balance += amount;
    }

    public void debitBalance(int amount) {
        balance -= amount;

    }

    public double getBalance() {
        return balance;

    }


}