public class InsufficientFundsException extends _____ { // TODO: Exception
    private final double balance;
    private final double requested;

    public InsufficientFundsException(double balance, double requested) {
        super(_____); // TODO: formatted message
        this.balance = balance;
        this.requested = requested;
    }

    public double getBalance() { return balance; }
    public double getRequested() { return requested; }
    public double getShortfall() { return requested - balance; }
}
