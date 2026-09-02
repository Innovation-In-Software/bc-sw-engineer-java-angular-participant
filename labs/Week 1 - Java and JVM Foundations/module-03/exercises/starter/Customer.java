public class Customer implements Printable {
    private final String id;
    private final String name;

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void printDetails() {
        // TODO: printf "Customer %s: %s%n" with id and name
        throw new UnsupportedOperationException("TODO");
    }
}
