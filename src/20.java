import java.util.Scanner;

public class MathHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Enter operation (+, -, *, /): ");
        String operation = scanner.next();
        
        if (operation.equals("+")) {
            System.out.println("Result: " + (num1 + num2));
        } else if (operation.equals("-")) {
            System.out.println("Result: " + (num1 - num2));
        } else if (operation.equals("*")) {
            System.out.println("Result: " + (num1 * num2));
        } else if (operation.equals("/")) {
            if (num2 != 0) {
                System.out.println("Result: " + (num1 / num2));
            } else {
                System.out.println("Error: Division by zero");
            }
        } else {
            System.out.println("Invalid operation. Please try again.");
        }
    }
}
