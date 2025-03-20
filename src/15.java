import java.util.Random;
public class MathHomework {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(10);
        int b = rand.nextInt(10);
        System.out.println("The sum of " + a + " and " + b + " is: ");
        System.out.println(a + b);
    }
}
