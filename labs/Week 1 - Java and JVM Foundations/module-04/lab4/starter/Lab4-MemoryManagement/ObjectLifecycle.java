public class ObjectLifecycle {

    public static void main(String[] args) {
        System.out.println("===== Object Lifecycle Demonstration =====");

        System.out.println("Step 1: Create object");
        Person person = new Person("Diana", 27);
        System.out.println("Created -> " + person);
        System.out.println("Identity hash : " + System.identityHashCode(person));

        System.out.println();
        System.out.println("Step 2: Use object");
        System.out.println("Name : " + person.getName());
        System.out.println("Age  : " + person.getAge());

        System.out.println();
        System.out.println("Step 3: Hold reference");
        Person secondReference = person;
        System.out.println("secondReference points to same object : "
                + (System.identityHashCode(secondReference) == System.identityHashCode(person)));

        System.out.println();
        System.out.println("Step 4: Remove references");
        person = null;
        System.out.println("person reference removed");
        secondReference = null;
        System.out.println("secondReference removed - object is now unreachable");

        System.out.println();
        System.out.println("Step 5: Eligible for Garbage Collection");
        MemoryMonitor.printMemoryReport("Before GC");
        MemoryMonitor.triggerGarbageCollection();
        MemoryMonitor.printMemoryReport("After GC");

        System.out.println();
        System.out.println("An object becomes eligible for GC when no live thread can reach it.");
    }
}
