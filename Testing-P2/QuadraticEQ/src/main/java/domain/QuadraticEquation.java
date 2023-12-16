package domain;

/**
 * <p>
 * <b>Class:</b></br>
 * QuadraticEquation.
 * </p>
 * 
 * <p>
 * <b>Description:</b></br>
 * The {@code QuadraticEquation} class represents a quadratic equation with
 * coefficients for the terms ax^2 + bx + c. It provides methods to set and get
 * the coefficients, calculate the solutions, and retrieve the solutions as
 * complex numbers.
 * </p>
 * 
 * <p>
 * <b>Control change:</b></br>
 * <ul>
 * <li><b>0.1.0:</b> Create class.
 * </ul>
 * </p>
 * 
 * @author A02-Group-A
 * @since 0.1.0
 * @version 0.1.0
 */
public class QuadraticEquation {
	/**
	 * <p>
	 * <b>Attribute:</b></br>
	 * coefficientA.
	 * </p>
	 * <p>
	 * <b>Description:</b></br>
	 * Coefficient of the x^2 term.
	 * </p>
	 */
	private double coefficientA;

	/**
	 * <p>
	 * <b>Attribute:</b></br>
	 * coefficientB.
	 * </p>
	 * <p>
	 * <b>Description:</b></br>
	 * Coefficient of the x term.
	 * </p>
	 */
	private double coefficientB;

	/**
	 * <p>
	 * <b>Attribute:</b></br>
	 * coefficientC.
	 * </p>
	 * <p>
	 * <b>Description:</b></br>
	 * Constant term.
	 * </p>
	 */
	private double coefficientC;

	/**
	 * <p>
	 * <b>Attribute:</b></br>
	 * sol1.
	 * </p>
	 * <p>
	 * <b>Description:</b></br>
	 * The first solution of the quadratic equation as a complex number.
	 * </p>
	 */
	private Complex sol1;

	/**
	 * <p>
	 * <b>Attribute:</b></br>
	 * sol2.
	 * </p>
	 * <p>
	 * <b>Description:</b></br>
	 * The second solution of the quadratic equation as a complex number.
	 * </p>
	 */
	private Complex sol2;

	/**
	 * <p>
	 * <b>Method:</b></br>
	 * QuadraticEquation.
	 * </p>
	 * 
	 * <p>
	 * <b>Description:</b></br>
	 * Constructs a quadratic equation with the specified coefficients.
	 *
	 *
	 * @param a The coefficient of the x^2 term.
	 * @param b The coefficient of the x term.
	 * @param c The constant term.
	 * @throws IllegalArgumentException If the coefficient of the x^2 term (a) is
	 *                                  zero.
	 */
	public QuadraticEquation(double a, double b, double c) throws IllegalArgumentException {
		setCoefficientA(a);
		setCoefficientB(b);
		setCoefficientC(c);
	}

	/**
	 * <p>
	 * <b>Method:</b></br>
	 * getCoefficientA.
	 * </p>
	 * 
	 * <p>
	 * <b>Description:</b></br>
	 * Gets the coefficient of the x^2 term.
	 *
	 * @return The coefficient of the x^2 term.
	 */
	public double getCoefficientA() {
		return coefficientA;
	}

	/**
	 * <p>
	 * <b>Method:</b></br>
	 * setCoefficientA.
	 * </p>
	 * 
	 * <p>
	 * <b>Description:</b></br>
	 * Sets the coefficient of the x^2 term.
	 *
	 * @param a The new coefficient of the x^2 term.
	 * @throws IllegalArgumentException If the specified coefficient is zero.
	 */
	public void setCoefficientA(double a) throws IllegalArgumentException {
		if (a == 0) {
			throw new IllegalArgumentException("A can't be 0, no quadratic equation.");
		}
		coefficientA = a;
	}

	/**
	 * <p>
	 * <b>Method:</b></br>
	 * getCoefficientB.
	 * </p>
	 * 
	 * <p>
	 * <b>Description:</b></br>
	 * Gets the coefficient of the x term.
	 * 
	 * @return The coefficient of the x term.
	 */
	public double getCoefficientB() {
		return coefficientB;
	}

	/**
	 * <p>
	 * <b>Method:</b></br>
	 * setCoefficientB.
	 * </p>
	 * 
	 * <p>
	 * <b>Description:</b></br>
	 * Sets the coefficient of the x term.
	 * 
	 * @param b The new coefficient of the x term.
	 */
	public void setCoefficientB(double b) {
		coefficientB = b;
	}

	/**
	 * <p>
	 * <b>Method:</b></br>
	 * getCoefficientC.
	 * </p>
	 * 
	 * <p>
	 * <b>Description:</b></br>
	 * Gets the constant term.
	 * 
	 * @return The constant term.
	 */
	public double getCoefficientC() {
		return coefficientC;
	}

	/**
	 * <p>
	 * <b>Method:</b></br>
	 * setCoefficientC.
	 * </p>
	 * 
	 * <p>
	 * <b>Description:</b></br>
	 * Sets the constant term.
	 * 
	 * @param c The new constant term.
	 */
	public void setCoefficientC(double c) {
		coefficientC = c;
	}

	/**
	 * <p>
	 * <b>Method:</b></br>
	 * getSol1.
	 * </p>
	 * 
	 * <p>
	 * <b>Description:</b></br>
	 * Gets the first solution of the quadratic equation.
	 *
	 * @return The first solution as a complex number.
	 */
	public Complex getSol1() {
		return sol1;
	}

	/**
	 * <p>
	 * <b>Method:</b></br>
	 * getSol2.
	 * </p>
	 * 
	 * <p>
	 * <b>Description:</b></br>
	 * Gets the second solution of the quadratic equation.
	 *
	 * @return The second solution as a complex number.
	 */
	public Complex getSol2() {
		return sol2;
	}

	/**
	 * <p>
	 * <b>Method:</b></br>
	 * calculate.
	 * </p>
	 * 
	 * <p>
	 * <b>Description:</b></br>
	 * Calculates the solutions of the quadratic equation and stores them in the
	 * sol1 and sol2 fields.
	 */

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
