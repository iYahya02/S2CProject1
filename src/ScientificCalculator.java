import java.util.Scanner;

class InputExample {
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