import java.util.Scanner;

public class MathHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double difference = Math.abs(num1 - num2);

        if (difference >= 0.5) {
            System.out.println("The absolute value of the difference is: " + difference);
        } else {
            System.out.println("The difference is not between 0 and 0.5.");
        }

        scanner.close();
    }
}
