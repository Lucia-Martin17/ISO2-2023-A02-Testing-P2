package application;

import domain.Complex;
import domain.QuadraticEquation;
import presentation.Interface_CLI;

public class App {
	public static void main(String[] args) {
		Interface_CLI cli = new Interface_CLI();
		cli.outputMessage("Quadratic equation: Ax² + Bx + C");
		double coefficientA = cli.keyboardInputDouble("Introduce coefficient A (quadratic coefficient):");
		double coefficientB = cli.keyboardInputDouble("Introduce coefficient B (linear coefficient):");
		double coefficientC = cli.keyboardInputDouble("Introduce coefficient C (independent term):");

		try {
			QuadraticEquation quadraticEq = new QuadraticEquation(coefficientA, coefficientB, coefficientC);
			quadraticEq.calculate();
			Complex Sol1 = quadraticEq.getSol1();
			Complex Sol2 = quadraticEq.getSol2();

			cli.outputMessage("Root 1: " + Sol1.toString() + " Root 2: " + Sol2.toString());
		} catch (IllegalArgumentException e) {
			cli.outputErrorMessage(e);
		}
	}
}
