import java.util.Random;

public class MathHomeworkSolver {
    private static final Random RANDOM = new Random();

    public void solveEquation(String equation) {
        try {
            double result = parse(equation);
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.err.println("Error parsing the equation. The equation is not a valid mathematical expression.");
            e.printStackTrace();
        }
    }

    private double parse(String equation) {
        double result = 0;
        String[] parts = equation.split(" ");
        for (String part : parts) {
            if (!part.isEmpty()) {
                try {
                    result += parsePart(part);
                } catch (NumberFormatException e) {
                    System.err.println("Error parsing the number: " + part);
                    e.printStackTrace();
                }
            }
        }
        return Math.signum(result);
    }

    private double parsePart(String part) throws NumberFormatException {
        if (!part.matches("\\d+")) {
            throw new NumberFormatException("Invalid expression: " + part);
        }
        try {
            return Double.parseDouble(part);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid number: " + part);
        }
    }

    public static void main(String[] args) {
        System.out.println(new MathHomeworkSolver().solveEquation("5+2=7"));
        System.out.println(new MathHomeworkSolver().solveEquation("-3-8=-11"));
    }
}
