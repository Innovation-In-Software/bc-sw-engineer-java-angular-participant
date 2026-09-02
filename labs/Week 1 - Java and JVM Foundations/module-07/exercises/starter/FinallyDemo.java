public class FinallyDemo {
    public static void main(String[] args) {
        // TODO: success path — try/catch/finally printing stage labels
        try {
            System.out.println("try: success work");
        } catch (Exception ex) {
            System.out.println("catch: " + ex.getClass().getSimpleName());
        } finally {
            // TODO: print finally success
            System.out.println(_____);
        }

        // TODO: failure path — throw/catch and prove finally still runs
        try {
            int x = 10 / 0;
            System.out.println(x);
        } catch (_____ ex) {
            System.out.println("catch: " + ex.getClass().getSimpleName());
        } finally {
            System.out.println(_____);
        }
    }
}
