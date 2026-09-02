public class CommonExceptionsDemo {
    public static void main(String[] args) {
        try {
            int divisor = 0;
            int result = 10 / divisor;
            System.out.println(result);
        } catch (_____ ex) { // TODO: ArithmeticException
            System.out.println("Caught: " + ex.getClass().getSimpleName());
        }

        try {
            String value = null;
            System.out.println(value.length());
        } catch (_____ ex) { // TODO: NullPointerException
            System.out.println("Caught: " + ex.getClass().getSimpleName());
        }

        try {
            int[] values = {10, 20};
            System.out.println(values[5]);
        } catch (_____ ex) { // TODO: ArrayIndexOutOfBoundsException
            System.out.println("Caught: " + ex.getClass().getSimpleName());
        }

        System.out.println("Program continued.");
    }
}
