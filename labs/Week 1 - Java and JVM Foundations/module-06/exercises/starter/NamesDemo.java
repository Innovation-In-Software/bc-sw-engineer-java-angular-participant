import java.util.List;

public class NamesDemo {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.sample();

        // TODO: map to names (prefer Employee::name), collect to List<String>
        List<String> names = employees.stream()
                // TODO: .map(...)
                // TODO: .toList()
                ;

        System.out.println("Names:");
        names.forEach(System.out::println);
    }
}
