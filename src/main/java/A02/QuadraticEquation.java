package A02;

public class QuadraticEquation {
	private double coefficientA;
    private double coefficientB;
    private double coefficientC;
    private Complex sol1;
    private Complex sol2;

    public QuadraticEquation(double a, double b, double c) throws IllegalArgumentException{
        setCoefficientA(a);
        setCoefficientB(b);
        setCoefficientC(c);
    }

    public double getCoefficientA() {
        return coefficientA;
    }

    public void setCoefficientA(double a) throws IllegalArgumentException{
        if (a == 0){
            throw new IllegalArgumentException ("A can't be 0, no quadratic equation.");
        }
        coefficientA = a;
    }

    public double getCoefficientB() {
        return coefficientB;
    }

    public void setCoefficientB(double b) {
        coefficientB = b;
    }

    public double getCoefficientC() {
        return coefficientC;
    }

    public void setCoefficientC(double c) {
        coefficientC = c;
    }

    public Complex getSol1() {
        return sol1;
    }

    public Complex getSol2() {
        return sol2;
    }

    public void calculate() {
        double delta = Math.pow(coefficientB, 2) - 4 * coefficientA * coefficientC;
        if (delta > 0) {
            sol1 = new Complex((-coefficientB + Math.sqrt(delta)) / (2 * coefficientA), 0);
            sol2 = new Complex((-coefficientB - Math.sqrt(delta)) / (2 * coefficientA), 0);
        } else if (delta == 0) {
            sol1 = new Complex(-coefficientB / (2 * coefficientA), 0);
            sol2 = sol1;
        } else {
            sol1 = new Complex(-coefficientB / (2 * coefficientA), Math.sqrt(delta * -1) / (2 * coefficientA));
            sol2 = new Complex(-coefficientB / (2 * coefficientA), -1 * Math.sqrt(delta * -1) / (2 * coefficientA));
        }
    }
}
