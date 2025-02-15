
import java.util.Scanner;

public class Program {

    // Nonrecursive factorial calculation
    static int nonRecursive(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Recursive factorial calculation
    static int recursive(int n) {
        if (n == 0) {
            return 1;
        }
        return n * recursive(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Enter a number to calculate its factorial:");
            int number = scanner.nextInt();

            System.out.println("Choose an option:");
            System.out.println("1. Nonrecursive Factorial");
            System.out.println("2. Recursive Factorial");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int nonRecursiveResult = nonRecursive(number);
                    System.out.println("Nonrecursive Factorial of " + number + " is: " + nonRecursiveResult);
                    break;
                case 2:
                    int recursiveResult = recursive(number);
                    System.out.println("Recursive Factorial of " + number + " is: " + recursiveResult);
                    break;
                case 3:
                    System.out.println("Terminating Program...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println(); // For spacing
        }

        System.out.println("Programmer's Name: Predas, Ralph Nikko M.");
        scanner.close();
    }
}
