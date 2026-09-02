import java.util.List;

public class RaiseDemo {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.sample();

        // TODO: map each salary * 1.10 without mutating source employees
        List<Double> raised = employees.stream()
                // TODO: .map(...)
                // TODO: .toList()
                ;

        System.out.println("Raised salaries:");
        raised.forEach(s -> System.out.printf("%.0f%n", s));

        System.out.println("Original Alice salary: " + employees.get(0).salary());
    }
}
