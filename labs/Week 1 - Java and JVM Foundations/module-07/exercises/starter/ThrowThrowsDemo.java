public class ThrowThrowsDemo {
    // TODO: declare throws if using a checked exception in your design
    static void requirePositive(double amount) {
        if (amount <= 0) {
            // TODO: throw IllegalArgumentException (or your chosen type)
            _____
        }
        System.out.println("Amount ok: " + amount);
    }

    public static void main(String[] args) {
        try {
            requirePositive(-5);
        } catch (_____ ex) {
            System.out.println("Rejected: " + ex.getMessage());
        }
        requirePositive(25);
    }
}
