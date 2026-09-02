public class CustomExceptionDemo {
    public static void main(String[] args) {
        Account account = new Account(100.00);
        try {
            account.withdraw(150.00);
        } catch (InsufficientFundsException ex) {
            System.out.println(ex.getMessage());
            System.out.printf("Short by: %.2f%n", ex.getShortfall());
        }
        System.out.printf("Balance unchanged: %.2f%n", account.getBalance());
    }
}
