
import java.util.Random;

public class MathHomework {
    public static void main(String[] args) {
        Random rand = new Random();
        int num1 = rand.nextInt(10) + 1;
        int num2 = rand.nextInt(10) + 1;
        int answer = num1 * num2;
        System.out.println("What is " + num1 + " times " + num2);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (Integer.parseInt(input) == answer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect, the correct answer is " + answer);
        }
    }
}