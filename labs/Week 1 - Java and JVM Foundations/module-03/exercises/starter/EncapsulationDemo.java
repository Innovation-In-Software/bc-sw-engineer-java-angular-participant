public class EncapsulationDemo {
    public static void main(String[] args) {
        Account account = new Account(100.00);

        account.deposit(50.00);     // balance: 150
        account.withdraw(30.00);    // balance: 120
        account.withdraw(500.00);   // rejected; balance remains 120

        // TODO: after implementing Account methods, this should print Final balance: 120.00
        System.out.printf(
                "Final balance: %.2f%n", account.getBalance());
    }
}
