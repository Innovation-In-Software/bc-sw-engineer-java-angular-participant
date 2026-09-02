import java.util.List;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.sample();

        // TODO: sequential count
        long sequential = employees.stream()
                // TODO: .count() or filter+count
                ;

        // TODO: parallel count with same logic
        long parallel = employees.parallelStream()
                // TODO: same terminal logic
                ;

        System.out.println("Sequential: " + sequential);
        System.out.println("Parallel: " + parallel);
        System.out.println("Match: " + (sequential == parallel));
    }
}
