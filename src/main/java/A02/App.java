package A02;
import reading.Read;
public class App {
	public static void main(String[] args) throws Exception {

        System.out.println("Quadratic equation: Ax² + Bx + C");
        
        double coefficientA = Read.read_double("Introduce coefficient A (quadratic coefficient):");
        double coefficientB = Read.read_double("Introduce coefficient B (linear coefficient):");
        double coefficientC = Read.read_double("Introduce coefficient C (independent term):");

        try {
            QuadraticEquation quadraticEq = new QuadraticEquation(coefficientA, coefficientB, coefficientC);
            quadraticEq.calculate();
            Complex Sol1 = quadraticEq.getSol1();
            Complex Sol2 = quadraticEq.getSol2();

            System.out.println("Root 1: " + Sol1.toString() + " Root 2: " + Sol2.toString());
        } catch (IllegalArgumentException e) {
            System.err.println(e);
        }
    }
}
