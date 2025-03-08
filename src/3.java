
public class MathHomework {

    public static void main(String[] args) {
        System.out.println(solveEquation("x^2 + 5x - 6 = 0"));
    }

    private static int solveEquation(String equation) {
        // Convert the equation to a polynomial
        Polynomial polynomial = new Polynomial(equation);

        // Find the roots of the polynomial using the quadratic formula
        double root1 = (-polynomial.getCoefficient(2) + Math.sqrt(polynomial.getCoefficient(2) * polynomial.getCoefficient(2) - 4 * polynomial.getCoefficient(1) * polynomial.getCoefficient(0))) / (2 * polynomial.getCoefficient(1));
        double root2 = (-polynomial.getCoefficient(2) - Math.sqrt(polynomial.getCoefficient(2) * polynomial.getCoefficient(2) - 4 * polynomial.getCoefficient(1) * polynomial.getCoefficient(0))) / (2 * polynomial.getCoefficient(1));

        // Return the root that is greater than or equal to 0
        return root1 >= 0 ? (int) root1 : (int) root2;
    }
}