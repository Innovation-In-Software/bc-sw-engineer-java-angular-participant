import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        // TODO: create HashSet<String> categories
        Set<String> categories = _____;

        // TODO: add "Java" and print whether the set changed (add returns boolean)
        System.out.println(
                "Added Java first time: "
                + _____);

        // TODO: add "Testing" and "Databases"
        _____
        _____

        // TODO: try adding "Java" again — print whether the set changed
        System.out.println(
                "Added Java second time: "
                + _____);

        System.out.println(
                "Unique count: " + categories.size());
        System.out.println(
                "Contains Testing: "
                + _____);

        // TODO: print sorted view using new TreeSet<>(categories)
        System.out.println(
                "Sorted view: "
                + _____);
    }
}
