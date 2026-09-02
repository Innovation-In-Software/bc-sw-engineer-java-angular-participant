public class ControlFlowBug {
    public static void main(String[] args) {
        int count = 3;
        // BUG: loop never decreases count — will hang if you run as-is
        while (count > 0) {
            System.out.println("countdown " + count);
            // TODO: fix — decrease count so the loop ends
        }
    }
}
