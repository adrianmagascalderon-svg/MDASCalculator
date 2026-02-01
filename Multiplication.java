import java.util.Scanner;

public class Multiplication {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Calculation
        double result = num1 * num2;

        // Formatted Output
        System.out.println("\nCOMPUTATION: " + num1 + " * " + num2 + " =");
        System.out.println("ANSWER : " + result);

        scanner.close();
    }
}

