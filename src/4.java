import java.util.Random;

public class MathHomework {
    public static int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(10) + 1;
    }
}
