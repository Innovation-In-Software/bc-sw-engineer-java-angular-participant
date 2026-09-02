public class PerformanceTest {

    private static class SampleObject {
        private final int value;
        private final byte[] data = new byte[64];

        SampleObject(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        System.out.println("===== Performance Measurement =====");
        MemoryMonitor.printMemoryReport("Start");

        int[] objectCounts = {10, 100, 1_000, 100_000, 1_000_000};

        System.out.println();
        System.out.printf("%-12s %-14s %-18s%n", "Objects", "Used Memory", "Execution Time");
        System.out.println("--------------------------------------------------");

        for (int count : objectCounts) {
            runAllocationTest(count);
        }

        System.out.println();
        System.out.println("Additional measurements:");
        measureLoopExecution();
        measureArrayAllocation();
        measureLargeByteArray();
    }

    private static void runAllocationTest(int count) {
        MemoryMonitor.triggerGarbageCollection();
        long memoryBefore = MemoryMonitor.getUsedMemoryBytes();
        long start = System.nanoTime();

        // TODO: allocate SampleObject[count], fill each slot
        // TODO: measure elapsed ms + memoryUsed; printf row; null array + GC
        throw new UnsupportedOperationException("TODO");
    }

    private static void measureLoopExecution() {
        // TODO: loop 10_000_000 iterations summing i into sum; print elapsed ms
        throw new UnsupportedOperationException("TODO");
    }

    private static void measureArrayAllocation() {
        // TODO: allocate int[1_000_000], fill with i, print elapsed ms
        throw new UnsupportedOperationException("TODO");
    }

    private static void measureLargeByteArray() {
        MemoryMonitor.printMemoryReport("Before Large byte[]");
        // TODO: allocate 10 MB byte[]; print After report; null + GC; print After Releasing
        throw new UnsupportedOperationException("TODO");
    }
}
