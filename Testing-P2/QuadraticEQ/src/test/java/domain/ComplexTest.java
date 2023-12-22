package domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComplexTest {
	static Complex myComplex = new Complex(double r = 80, double imag = 70);
	
	@Test
	public void testComplex() {
		Complex test = new Complex(double r = 40, double imag = -5);
		assertTrue(test != null);
	}

	@Test
	public void testGetReal() {
		assertTrue(myComplex.getReal() != null);
	}

	@Test
	public void testGetImaginary() {
		assertTrue(myComplex.getImaginary() != null);
	}


	@Test
	public void testToString() {
		assertTrue(myComplex.toString() != null);
	}
	
	@Test
	public void decision_1() {
		Complex complx = new Complex(double r = 40, double imag = 1);
		assertTrue(test.toString() != null);
	}
	
	@Test
	public void decision_2() {
		Complex complx = new Complex(double r = 40, double imag = 0);
		assertTrue(test.toString() != null);
	}
	
	@Test
	public void decision_3() {
		Complex complx = new Complex(double r = 40, double imag = -1);
		assertTrue(test.toString() != null);
	}
	

}
