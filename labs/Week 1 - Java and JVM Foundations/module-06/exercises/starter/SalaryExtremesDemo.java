import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SalaryExtremesDemo {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.sample();

        // TODO: max by salary
        Optional<Employee> highest = employees.stream()
                // TODO: .max(...)
                ;

        // TODO: min by salary — new stream
        Optional<Employee> lowest = employees.stream()
                // TODO: .min(...)
                ;

        highest.ifPresent(e -> System.out.printf("Highest: %s - %.0f%n", e.name(), e.salary()));
        lowest.ifPresent(e -> System.out.printf("Lowest: %s - %.0f%n", e.name(), e.salary()));
    }
}
