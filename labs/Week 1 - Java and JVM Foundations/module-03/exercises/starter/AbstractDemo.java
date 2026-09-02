public class AbstractDemo {
    public static void main(String[] args) {
        // AbstractAccount account = new AbstractAccount(50.00); // will not compile — try it, then comment it out
        AbstractAccount account = new AbstractSavings(50.00);
        System.out.println(account.getAccountType() + " balance: " + account.getBalance());
    }
}
