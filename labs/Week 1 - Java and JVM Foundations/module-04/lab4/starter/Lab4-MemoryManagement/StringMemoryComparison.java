public class StringMemoryComparison {

    public static void main(String[] args) {
        System.out.println("===== Bonus: String vs StringBuilder =====");
        int iterations = 10_000;

        MemoryMonitor.triggerGarbageCollection();
        long memoryBefore = MemoryMonitor.getUsedMemoryBytes();
        long start = System.nanoTime();

        String result = "";
        for (int i = 0; i < iterations; i++) {
            result += "item-" + i + "-";
        }

        long stringMillis = (System.nanoTime() - start) / 1_000_000;
        long stringMemory = MemoryMonitor.getUsedMemoryBytes() - memoryBefore;
        System.out.printf("String concatenation : %d ms | approx used memory : %.2f MB | length : %d%n",
                stringMillis, MemoryMonitor.toMegabytesDouble(stringMemory), result.length());

        result = null;
        MemoryMonitor.triggerGarbageCollection();

        memoryBefore = MemoryMonitor.getUsedMemoryBytes();
        start = System.nanoTime();

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            builder.append("item-").append(i).append("-");
        }
        String builderResult = builder.toString();

        long builderMillis = (System.nanoTime() - start) / 1_000_000;
        long builderMemory = MemoryMonitor.getUsedMemoryBytes() - memoryBefore;
        System.out.printf("StringBuilder build  : %d ms | approx used memory : %.2f MB | length : %d%n",
                builderMillis, MemoryMonitor.toMegabytesDouble(builderMemory), builderResult.length());
    }
}
