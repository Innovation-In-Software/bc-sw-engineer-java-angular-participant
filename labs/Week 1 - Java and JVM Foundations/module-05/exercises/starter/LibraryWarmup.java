import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryWarmup {
    // TODO: declare availableTitles as ArrayList<String>
    private final List<String> availableTitles =
            _____;

    // TODO: declare borrowedByMember as HashMap<String, String>
    private final Map<String, String> borrowedByMember =
            _____;

    public LibraryWarmup() {
        // TODO: add "Effective Java" and "Clean Code" to availableTitles
        _____
        _____
    }

    boolean checkout(String memberId, String title) {
        // TODO: return false if member already has an active loan
        if (_____) {
            return false;
        }

        // TODO: return false when title is unavailable (remove returns false)
        if (_____) {
            return false;
        }

        // TODO: record the loan in borrowedByMember
        _____;
        return true;
    }

    void printStatus() {
        System.out.println(
                "Available: " + availableTitles);
        System.out.println(
                "Borrowed: " + borrowedByMember);
    }

    public static void main(String[] args) {
        LibraryWarmup library = new LibraryWarmup();

        System.out.println(
                "Checkout success: "
                + library.checkout(
                        "M101", "Effective Java"));

        System.out.println(
                "Duplicate checkout: "
                + library.checkout(
                        "M101", "Clean Code"));

        library.printStatus();
    }
}
