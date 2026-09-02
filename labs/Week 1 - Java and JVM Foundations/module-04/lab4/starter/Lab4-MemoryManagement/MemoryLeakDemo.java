import java.util.ArrayList;
import java.util.List;

public class MemoryLeakDemo {

    static class Employee {
        private final int id;
        private final String name;
        private final byte[] profileData = new byte[256];

        Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            printUsage();
            return;
        }

        String mode = args[0].toLowerCase();
        switch (mode) {
            case "leak" -> demonstrateLeak();
            case "fix" -> demonstrateFix();
            default -> printUsage();
        }
    }

    private static void demonstrateLeak() {
        System.out.println("===== Memory Leak Demonstration =====");
        System.out.println("Adding employees to a static list that is never cleared...");
        MemoryMonitor.printMemoryReport("Before Allocation");

        List<Employee> employees = LEAK_HOLDER.employees;
        int targetCount = 1_000_000;
        int step = 100_000;

        // TODO: add Employee(i, "Employee-" + i) for i=1..targetCount
        // TODO: every step objects, print count + MemoryMonitor.printMemoryReport
        throw new UnsupportedOperationException("TODO");
    }

    private static void demonstrateFix() {
        System.out.println("===== Memory Leak Fix Demonstration =====");
        MemoryMonitor.printMemoryReport("Before Allocation");

        // TODO: create local ArrayList; add 500_000 employees; print After Allocation
        // TODO: clear list, null it, trigger GC, print After GC
        throw new UnsupportedOperationException("TODO");
    }

    private static void printUsage() {
        System.out.println("Usage:");
        System.out.println("  java MemoryLeakDemo leak");
        System.out.println("  java MemoryLeakDemo fix");
    }

    private static class LeakHolder {
        private final List<Employee> employees = new ArrayList<>();
    }

    private static final LeakHolder LEAK_HOLDER = new LeakHolder();
}
