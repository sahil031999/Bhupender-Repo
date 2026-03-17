import java.util.Scanner;

public class DummyApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("=== Welcome to Dummy Application ===");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Say Hello");
            System.out.println("2. Add Two Numbers");
            System.out.println("3. Display Info");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    sayHello();
                    break;

                case 2:
                    addNumbers(scanner);
                    break;

                case 3:
                    displayInfo();
                    break;

                case 0:
                    System.out.println("Exiting application... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        scanner.close();
    }

    public static void sayHello() {
        System.out.println("Hello, user! 👋");
    }

    public static void addNumbers(Scanner scanner) {
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }

    public static void displayInfo() {
        System.out.println("This is a dummy Java application for demo purposes.");
        System.out.println("Version: 1.0");
        System.out.println("Author: You 😄");
    }
}
