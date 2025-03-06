import java.util.Random;

public class MathHomework {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(10);
        int b = random.nextInt(10);
        System.out.println("What is " + a + " x " + b + "?");
    }
}