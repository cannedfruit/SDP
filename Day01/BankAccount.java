package Day01;

/**
 * SDP Day 1
 * @author Sarah on 1/8/2016.
 */
public class BankAccount {
    private float balance;
    public void deposit(float amount) {
        this.balance += amount;
    }
    public float showBalance() {
        return this.balance;
    }
    BankAccount() {
        balance = 100;
    }
}
