import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingWarmup {
    private static final Logger LOGGER =
            Logger.getLogger(
                    LoggingWarmup.class.getName());

    public static void main(String[] args) {
        // Demo identifier only — never log real PINs or secrets.
        String accountId = "A-1001";

        try {
            throw new IllegalStateException(
                    "Withdrawal service unavailable");
        } catch (IllegalStateException ex) {
            // TODO: LOGGER.log(Level.SEVERE, "Withdrawal failed accountId=" + accountId, ex)
            //   pass ex as the third argument to keep the stack trace

            // TODO: print user-safe message:
            //   "User message: Withdrawal could not be completed."
        }
    }
}
