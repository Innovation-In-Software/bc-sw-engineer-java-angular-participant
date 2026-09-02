public class StrategyDemo {
    static int attempts;

    static String flakyCall() {
        attempts++;
        if (attempts < 3) {
            throw new IllegalStateException("transient failure #" + attempts);
        }
        return "OK";
    }

    public static void main(String[] args) {
        attempts = 0;
        String result = _____; // TODO: retry then fallback
        System.out.println("Result: " + result);
    }
}
