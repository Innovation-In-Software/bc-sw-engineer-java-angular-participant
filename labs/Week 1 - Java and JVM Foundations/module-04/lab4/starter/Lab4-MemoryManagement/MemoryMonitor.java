public class MemoryMonitor {

    private MemoryMonitor() {
    }

    public static void printMemoryReport(String label) {
        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long maxMemory = runtime.maxMemory();
        long usedMemory = totalMemory - freeMemory;

        System.out.println();
        System.out.println("===== JVM Memory Report: " + label + " =====");
        System.out.printf("Total Memory : %d MB%n", toMegabytes(totalMemory));
        System.out.printf("Free Memory  : %d MB%n", toMegabytes(freeMemory));
        System.out.printf("Used Memory  : %d MB%n", toMegabytes(usedMemory));
        System.out.printf("Max Memory   : %d MB%n", toMegabytes(maxMemory));
        System.out.println("-----------------------------");
    }

    public static long getUsedMemoryBytes() {
        Runtime runtime = Runtime.getRuntime();
        return runtime.totalMemory() - runtime.freeMemory();
    }

    public static void triggerGarbageCollection() {
        System.gc();
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public static long toMegabytes(long bytes) {
        return bytes / (1024 * 1024);
    }

    public static double toMegabytesDouble(long bytes) {
        return bytes / (1024.0 * 1024.0);
    }
}
