import java.util.Scanner;

public class BillSummary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Product name: ");
        // TODO: read name
        // String name = _____;

        System.out.print("Quantity: ");
        // TODO: read qty (nextLine + Integer.parseInt)
        // int qty = _____;

        System.out.print("Unit price: ");
        // TODO: read price (nextLine + Double.parseDouble)
        // double price = _____;

        // TODO: compute total (qty * price), 10% discount, and final amount
        // TODO: print Product, Quantity, Unit price, Total, Discount (10%), Final amount
        // hints: %.2f for money; use 10%% in the format string to print a literal %

        scanner.close();
        throw new UnsupportedOperationException("TODO");
    }
}
