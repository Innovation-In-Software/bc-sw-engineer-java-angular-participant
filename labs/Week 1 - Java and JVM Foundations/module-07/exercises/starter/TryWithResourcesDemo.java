import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TryWithResourcesDemo {
    public static void main(String[] args) {
        // Relative path: current working directory must be the exercises folder.
        Path file = Path.of("transactions.txt");

        try {
            Files.writeString(
                    file, "deposit 100\nwithdraw 25\n");

            // TODO: try-with-resources — BufferedReader from Files.newBufferedReader(file)
            try (_____ reader = _____) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println("Read: " + line);
                }
            } // reader.close() happens here automatically

            System.out.println(
                    "Reader closed automatically.");
        } catch (_____ ex) { // TODO: catch IOException
            // TODO: print "File error: " + ex.getMessage()
        }
    }
}
