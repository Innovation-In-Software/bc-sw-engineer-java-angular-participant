import java.util.Scanner;

public class DecisionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Score (0-100): ");
        int score = Integer.parseInt(scanner.nextLine());

        // TODO: if / else if / else — print Grade: A/B/C/F
        //   A: score >= 90
        //   B: score >= 80
        //   C: score >= 70
        //   F: otherwise
        //   (branch order matters — first true wins)

        System.out.print("Day number (1-7): ");
        int day = Integer.parseInt(scanner.nextLine());

        // TODO: switch on day — print Monday..Sunday for 1..7
        //   use arrow form: case 1 -> System.out.println("Monday");
        //   default -> System.out.println("Not a valid day");

        scanner.close();
    }
}
