import java.util.List;

public class HrNamesDemo {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.sample();

        // TODO: filter HR → map name → sorted → toList
        List<String> hrNames = employees.stream()
                // TODO: .filter(...)
                // TODO: .map(...)
                // TODO: .sorted()
                // TODO: .toList()
                ;

        System.out.println("HR names:");
        hrNames.forEach(System.out::println);
    }
}
