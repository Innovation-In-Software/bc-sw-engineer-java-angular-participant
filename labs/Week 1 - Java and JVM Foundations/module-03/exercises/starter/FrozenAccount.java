public class FrozenAccount extends Account {
    public FrozenAccount(double initialBalance) {
        // Reuse Account construction and balance encapsulation.
        super(initialBalance);
    }

    @Override
    public boolean withdraw(double amount) {
        // TODO: refuse every withdrawal; return false (do not call super.withdraw)
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public String getAccountType() {
        // TODO: return "Frozen"
        throw new UnsupportedOperationException("TODO");
    }
}
