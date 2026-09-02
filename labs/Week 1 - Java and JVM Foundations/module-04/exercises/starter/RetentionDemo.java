import java.util.ArrayList;
import java.util.List;

public class RetentionDemo {
    // Static field is reachable from the loaded class (a GC root path).
    // TODO: private static final List<byte[]> CACHE = new ArrayList<>();

    static long usedMb() {
        Runtime runtime = Runtime.getRuntime();
        // TODO: long usedBytes = runtime.totalMemory() - runtime.freeMemory();
        // TODO: return usedBytes / (1024 * 1024);
    }

    public static void main(String[] args)
            throws InterruptedException {
        System.out.println("Before: " + usedMb() + " MB");

        // Bounded: 10,000 × 1 KB ≈ 10 MB payload.
        for (int i = 0; i < 10_000; i++) {
            // TODO: CACHE.add(new byte[1024]);
        }

        System.out.println(
                "Retained objects: " + CACHE.size());
        System.out.println(
                "After allocation: " + usedMb() + " MB");

        // Remove the strong references held by the list.
        // TODO: CACHE.clear();
        // TODO: System.gc();       request, not a guarantee
        // TODO: Thread.sleep(200); observation aid, not synchronization with GC

        System.out.println(
                "After clear (approx): " + usedMb() + " MB");
    }
}
