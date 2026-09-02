public class PropagationDemo {
    static void accountLayer()
            _____ { // TODO: throws InsufficientFundsException
        // Deepest layer creates the domain failure.
        // TODO: throw new InsufficientFundsException(100.00, 150.00)
    }

    static void serviceLayer()
            _____ { // TODO: throws InsufficientFundsException
        // No recovery here, so declare and let it propagate.
        accountLayer();
    }

    static void menuLayer()
            _____ { // TODO: throws InsufficientFundsException
        // Still no recovery action; keep the contract.
        serviceLayer();
    }

    public static void main(String[] args) {
        try {
            menuLayer();
        } catch (_____ ex) { // TODO: catch InsufficientFundsException
            // TODO: print "Caught at main: " + ex.getMessage()
            // TODO: ex.printStackTrace(System.out)
        }
    }
}
