import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

private static final boolean useScientificNotation = false;
private static final DecimalFormat decimalFormat = new DecimalFormat("#.#####"); // Decimal format preference (Stops after 5 decimal points)
private static final DecimalFormat scientificFormat = new DecimalFormat("0.######E0"); // Scientific format preference (Similar to the above but for scientific numbers)

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("--- Welcome to Scientific Calculator ---");
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

public static void displayMenu() {
    System.out.println("\n=== SCIENTIFIC CALCULATOR MENU ===");

    System.out.println("\n--- BASIC ARITHMETIC ---");
    System.out.println("1. Addition (+)");
    System.out.println("2. Subtraction (-)");
    System.out.println("3. Multiplication (*)");
    System.out.println("4. Division (/)");

    System.out.println("\n--- SCIENTIFIC OPERATIONS ---");
    System.out.println("5. Square Root (√x)");
    System.out.println("6. Power (x^y)");
    System.out.println("7. Natural Logarithm (ln x)");
    System.out.println("8. Logarithm Base 10 (log₁₀ x)");
    System.out.println("9. Absolute Value (|x|)");

    System.out.println("\n--- TRIGONOMETRIC FUNCTIONS ---");
    System.out.println("10. Sine (sin x)");
    System.out.println("11. Cosine (cos x)");
    System.out.println("12. Tangent (tan x)");

    System.out.println("\n--- ROUNDING FUNCTIONS ---");
    System.out.println("13. Round to nearest integer");
    System.out.println("14. Ceiling (round up)");
    System.out.println("15. Floor (round down)");

    System.out.println("\n--- COMPARISON FUNCTIONS ---");
    System.out.println("16. Minimum of two numbers");
    System.out.println("17. Maximum of two numbers");

    System.out.println("\n--- SETTINGS ---");
    System.out.println("18. Toggle output format (Current: " +
            (useScientificNotation ? "Scientific" : "Decimal") + ")");

    System.out.println("\n--- EXIT ---");
    System.out.println("0. Exit Calculator");

    System.out.print("\nEnter your choice: ");
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

