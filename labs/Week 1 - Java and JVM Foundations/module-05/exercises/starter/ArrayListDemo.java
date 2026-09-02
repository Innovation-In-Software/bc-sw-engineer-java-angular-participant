import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        // TODO: declare List<String> books as new ArrayList<>()
        List<String> books = _____;

        // TODO: add four titles — include "Java Fundamentals" twice (duplicate allowed)
        //   "Java Fundamentals", "Clean Code", "Effective Java", "Java Fundamentals"
        _____
        _____
        _____
        _____

        // TODO: replace the value at index 1 with "Clean Architecture"
        _____

        // TODO: search — does books contain "Effective Java"?
        boolean found = _____;

        // TODO: remove the first "Java Fundamentals" only (not removeIf)
        _____

        System.out.println(
                "Found Effective Java: " + found);
        System.out.println("Size: " + books.size());

        // TODO: print index and title for each element
        for (int i = 0; i < books.size(); i++) {
            System.out.printf(
                    "%d: %s%n", i, _____);
        }
    }
}
