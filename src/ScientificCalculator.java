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

/*private static void performOperation(Scanner scanner, int choice) {
    try {
        switch (choice) {
            case 1:
                performTwoNumberOperation(scanner, "Addition", "add");
                break;
            case 2:
                performTwoNumberOperation(scanner, "Subtraction", "subtract");
                break;
            case 3:
                performTwoNumberOperation(scanner, "Multiplication", "multiply");
                break;
            case 4:
                performTwoNumberOperation(scanner, "Division", "divide");
                break;
            case 5:
                performOneNumberOperation(scanner, "Square Root", "sqrt");
                break;
            case 6:
                performTwoNumberOperation(scanner, "Power", "power");
                break;
            case 7:
                performOneNumberOperation(scanner, "Natural Logarithm", "ln");
                break;
            case 8:
                performOneNumberOperation(scanner, "Logarithm Base 10", "log10");
                break;
            case 9:
                performOneNumberOperation(scanner, "Absolute Value", "abs");
                break;
            case 10:
                performTrigOperation(scanner, "Sine", "sin");
                break;
            case 11:
                performTrigOperation(scanner, "Cosine", "cos");
                break;
            case 12:
                performTrigOperation(scanner, "Tangent", "tan");
                break;
            case 13:
                performOneNumberOperation(scanner, "Round", "round");
                break;
            case 14:
                performOneNumberOperation(scanner, "Ceiling", "ceil");
                break;
            case 15:
                performOneNumberOperation(scanner, "Floor", "floor");
                break;
            case 16:
                performTwoNumberOperation(scanner, "Minimum", "min");
                break;
            case 17:
                performTwoNumberOperation(scanner, "Maximum", "max");
                break;
            case 18:
                toggleOutputFormat();
                break;
            default:
                System.out.println("Error: Invalid menu choice. Please select a number from 0-18.");
        }
    } catch (InputMismatchException e) {
        System.out.println("Error: Please enter a valid number.");
        scanner.nextLine(); // Clear invalid input
    }
}*/


/*private static void performOperation(Scanner scanner, int choice) {
    try {
        switch (choice) {
            case 1:
                performTwoNumberOperation(scanner, "Addition", "add");
                break;
            case 2:
                performTwoNumberOperation(scanner, "Subtraction", "subtract");
                break;
            case 3:
                performTwoNumberOperation(scanner, "Multiplication", "multiply");
                break;
            case 4:
                performTwoNumberOperation(scanner, "Division", "divide");
                break;
            case 5:
                performOneNumberOperation(scanner, "Square Root", "sqrt");
                break;
            case 6:
                performTwoNumberOperation(scanner, "Power", "power");
                break;
            case 7:
                performOneNumberOperation(scanner, "Natural Logarithm", "ln");
                break;
            case 8:
                performOneNumberOperation(scanner, "Logarithm Base 10", "log10");
                break;
            case 9:
                performOneNumberOperation(scanner, "Absolute Value", "abs");
                break;
            case 10:
                performTrigOperation(scanner, "Sine", "sin");
                break;
            case 11:
                performTrigOperation(scanner, "Cosine", "cos");
                break;
            case 12:
                performTrigOperation(scanner, "Tangent", "tan");
                break;
            case 13:
                performOneNumberOperation(scanner, "Round", "round");
                break;
            case 14:
                performOneNumberOperation(scanner, "Ceiling", "ceil");
                break;
            case 15:
                performOneNumberOperation(scanner, "Floor", "floor");
                break;
            case 16:
                performTwoNumberOperation(scanner, "Minimum", "min");
                break;
            case 17:
                performTwoNumberOperation(scanner, "Maximum", "max");
                break;
            case 18:
                toggleOutputFormat();
                break;
            default:
                System.out.println("Error: Invalid menu choice. Please select a number from 0-18.");
        }
    } catch (InputMismatchException e) {
        System.out.println("Error: Please enter a valid number.");
        scanner.nextLine(); // Clear invalid input
    }
} */

/*private static void performOneNumberOperation(Scanner scanner, String operationName, String operation) {
    System.out.print("Enter number: ");
    double num = scanner.nextDouble();

    double result = 0;
    boolean validOperation = true;

    switch (operation) {
        case "sqrt":
            result = calculateSquareRoot(num);
            break;
        case "ln":
            result = calculateNaturalLogarithm(num);
            break;
        case "log10":
            result = calculateLogarithmBase10(num);
            break;
        case "abs":
            result = calculateAbsoluteValue(num);
            break;
        case "round":
            long roundResult = roundNumber(num);
            System.out.println(operationName + " of " + formatNumber(num) + " = " + roundResult);
            return;
        case "ceil":
            result = ceilingNumber(num);
            break;
        case "floor":
            result = floorNumber(num);
            break;
        default:
            validOperation = false;
    }

    if (validOperation && !Double.isNaN(result)) {
        System.out.println(operationName + " of " + formatNumber(num) + " = " + formatNumber(result));
    }
}*/


/*private static void performTwoNumberOperation(Scanner scanner, String operationName, String operation) {
    System.out.print("Enter first number: ");
    double num1 = scanner.nextDouble();
    System.out.print("Enter second number: ");
    double num2 = scanner.nextDouble();

    double result = 0;
    boolean validOperation = true;

    switch (operation) {
        case "add":
            result = add(num1, num2);
            break;
        case "subtract":
            result = subtract(num1, num2);
            break;
        case "multiply":
            result = multiply(num1, num2);
            break;
        case "divide":
            result = divide(num1, num2);
            break;
        case "power":
            result = calculatePower(num1, num2);
            break;
        case "min":
            result = findMin(num1, num2);
            break;
        case "max":
            result = findMax(num1, num2);
            break;
        default:
            validOperation = false;
    }

    if (validOperation && !Double.isNaN(result) && !Double.isInfinite(result)) {
        System.out.println(operationName + " of " + formatNumber(num1) + " and " + formatNumber(num2) + " = " + formatNumber(result));
    }
}*/





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

