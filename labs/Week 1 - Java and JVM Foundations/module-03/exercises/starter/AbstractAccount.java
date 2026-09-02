// TODO: class must be abstract (public abstract class AbstractAccount)
public abstract class AbstractAccount {
    protected double balance;

    public AbstractAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    // TODO: abstract method — no body; every concrete subclass must implement
    public abstract String getAccountType();
}
