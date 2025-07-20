import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

private static final boolean useScientificNotation = false;
private static final DecimalFormat decimalFormat = new DecimalFormat("#.#####"); // Decimal format preference (Stops after 5 decimal points)
private static final DecimalFormat scientificFormat = new DecimalFormat("0.######E0"); // Scientific format preference (Similar to the above but for scientific numbers)

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("=== Welcome to Scientific Calculator ===");
    System.out.println("Current output format: " + (useScientificNotation ? "Scientific Notation" : "Simple Decimal"));

    while (true) {
        // displayMenu(); Must create a method for it to work
        try {
            int choice = scanner.nextInt();
            if (choice == 0) {
                System.out.println("Thank you for using Scientific Calculator. Goodbye!");
                break;
            }
            // performOperation(scanner, choice); Must create a method for it to work
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number.");
            scanner.nextLine(); // Clear invalid input
        }
        System.out.println(); // Add spacing between operations
    }
    scanner.close();
}

static class InputExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kindly enter your name : ");
        String name = input.nextLine();

        System.out.println("Kindly enter your age : ");
        int age = input.nextInt();

        System.out.println("Kindly enter your height (e.g., 1.83) : ");
        double height = input.nextDouble();

        System.out.printf("\nHello %s !%n", name);
        System.out.printf("You are %d years old.%n", age);
        System.out.printf("and you are %s meters tall.%n", height);
    }
}

