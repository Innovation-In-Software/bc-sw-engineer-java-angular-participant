import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        // TODO: declare Map<String, Integer> copies as new HashMap<>()
        Map<String, Integer> copies = _____;

        // TODO: put three ISBN → copy-count mappings
        //   key = String ISBN, value = Integer count
        //   copies.put("ISBN-JAVA", 3);   // NOT put(3, "ISBN-JAVA")
        //   "ISBN-JAVA" -> 3, "ISBN-CLEAN" -> 2, "ISBN-TEST" -> 4
        _____
        _____
        _____

        System.out.println(
                "Java copies: " + copies.get("ISBN-JAVA"));

        // TODO: update "ISBN-JAVA" to 5 (same key replaces old value)
        _____

        // TODO: remove "ISBN-CLEAN"
        _____

        System.out.println(
                "Updated Java copies: "
                + copies.get("ISBN-JAVA"));
        // TODO: Missing ISBN blank — use getOrDefault so absent keys print 0, not null
        //   copies.getOrDefault("ISBN-MISSING", 0)
        System.out.println(
                "Missing ISBN: "
                + _____);

        // TODO: iterate entrySet — print each key -> value on its own line
        for (Map.Entry<String, Integer> entry
                : copies.entrySet()) {
            System.out.println(
                    entry.getKey() + " -> " + entry.getValue());
        }

        // TODO: print deterministic key-sorted snapshot with new TreeMap<>(copies)
        System.out.println(
                "Sorted snapshot: " + _____);
    }
}
