import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryDemo {

    static class Employee {
        private final int id;
        private final String name;
        private final byte[] data = new byte[1024];

        Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        System.out.println("===== Bonus: Intentional OutOfMemoryError =====");
        System.out.println("Run with a small heap to observe failure faster:");
        System.out.println("java -Xms32m -Xmx64m OutOfMemoryDemo");
        System.out.println();

        List<Employee> employees = new ArrayList<>();

        try {
            int id = 1;
            while (true) {
                employees.add(new Employee(id, "Employee-" + id));
                id++;
                if (id % 100_000 == 0) {
                    System.out.println("Allocated " + id + " employees");
                    MemoryMonitor.printMemoryReport("Growing Heap");
                }
            }
        } catch (OutOfMemoryError error) {
            System.out.println();
            System.out.println("OutOfMemoryError occurred!");
            System.out.println("Reason: Heap could not grow enough to store newly allocated objects.");
            System.out.println("Message: " + error.getMessage());
            MemoryMonitor.printMemoryReport("At Failure");
        }
    }
}
