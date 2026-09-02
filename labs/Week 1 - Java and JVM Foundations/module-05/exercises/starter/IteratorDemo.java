import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        // TODO: wrap List.of(...) in new ArrayList<>(...) so removal is allowed
        List<String> titles = _____;

        // TODO: obtain an Iterator<String> from titles
        Iterator<String> iterator = _____;

        // TODO: loop while iterator.hasNext()
        while (_____) {
            String title = iterator.next();

            if (title.startsWith("Deprecated")) {
                // TODO: remove through the iterator (not titles.remove)
                _____;
            }
        }

        System.out.println("Remaining: " + titles);
    }
}
