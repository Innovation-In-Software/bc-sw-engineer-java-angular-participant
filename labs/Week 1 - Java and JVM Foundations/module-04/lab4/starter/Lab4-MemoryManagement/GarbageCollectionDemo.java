public class GarbageCollectionDemo {

    private static class DemoObject {
        private final String label;
        private final byte[] payload = new byte[128];

        DemoObject(String label) {
            this.label = label;
        }
    }

    public static void main(String[] args) {
        System.out.println("===== Garbage Collection Demonstration =====");
        long startTime = System.nanoTime();

        MemoryMonitor.printMemoryReport("Before Allocation");

        DemoObject[] objects = new DemoObject[100000];
        System.out.println("Creating Objects...");
        // TODO: fill objects[i] = new DemoObject("Object-" + i)
        // TODO: print Objects Created count; printMemoryReport After Allocation
        // TODO: set objects = null; trigger GC; print After GC report + elapsed ms
        // Tip: elapsedMillis = (System.nanoTime() - startTime) / 1_000_000
        throw new UnsupportedOperationException("TODO");
    }
}
