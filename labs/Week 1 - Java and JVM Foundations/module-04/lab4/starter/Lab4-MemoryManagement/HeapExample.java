public class HeapExample {

    static class Student {
        private final String name;

        Student(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "'}";
        }
    }

    static class Employee {
        private final int id;

        Employee(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Employee{id=" + id + "}";
        }
    }

    static class Customer {
        private final String customerId;

        Customer(String customerId) {
            this.customerId = customerId;
        }

        @Override
        public String toString() {
            return "Customer{customerId='" + customerId + "'}";
        }
    }

    static class Book {
        private final String title;

        Book(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return "Book{title='" + title + "'}";
        }
    }

    public static void main(String[] args) {
        System.out.println("===== Heap Memory Demonstration =====");
        MemoryMonitor.printMemoryReport("Before Allocation");

        Student student = new Student("John");
        Employee employee = new Employee(101);
        Customer customer = new Customer("C-5001");
        Book book = new Book("Effective Java");

        System.out.println("Objects created on the heap:");
        printObjectInfo("student", student);
        printObjectInfo("employee", employee);
        printObjectInfo("customer", customer);
        printObjectInfo("book", book);

        MemoryMonitor.printMemoryReport("After Allocation");

        System.out.println("Observation:");
        System.out.println("- References (student, employee, ...) live on the stack");
        System.out.println("- Actual objects live on the heap");
        System.out.println("- identityHashCode() helps distinguish object identity");
    }

    private static void printObjectInfo(String referenceName, Object object) {
        System.out.println();
        System.out.println("Reference (stack) : " + referenceName);
        System.out.println("Object (heap)     : " + object);
        System.out.println("Identity hash     : " + System.identityHashCode(object));
    }
}
