import java.util.List;

public final class EmployeeData {
    private EmployeeData() {
    }

    public static List<Employee> sample() {
        return List.of(
                new Employee(1, "Alice", "HR", 72_000),
                new Employee(2, "Bob", "IT", 65_000),
                new Employee(3, "Charlie", "HR", 80_000),
                new Employee(4, "Diana", "Finance", 90_000),
                new Employee(5, "Evan", "IT", 55_000));
    }
}
