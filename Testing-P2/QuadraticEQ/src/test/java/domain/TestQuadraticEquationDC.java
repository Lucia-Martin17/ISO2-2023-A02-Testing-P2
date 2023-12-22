package domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestQuadraticEquationDC {

	// A == 0
	@Test(expected = IllegalArgumentException.class)
	public void TestCase1() {
		QuadraticEquation Qe = new QuadraticEquation(0,2,4);
		Qe.calculate();
		
		assertTrue((Qe.sol1 != null) || (Qe.sol2 !=null));
	}
	
	// Delta > 0
	@Test
	public void TestCase2() {
		QuadraticEquation Qe = new QuadraticEquation(1,2,4);
		Qe.calculate();
		
		assertTrue((Qe.sol1 != null) || (Qe.sol2 !=null));
	}
	
	// Delta == 0
	@Test
	public void TestCase3() {
		QuadraticEquation Qe = new QuadraticEquation(1,0,0);
		Qe.calculate();
		
		assertTrue((Qe.sol1 != null) || (Qe.sol2 !=null));
	}
	
	// Delta < 0
	@Test
	public void TestCase4() {
		QuadraticEquation Qe = new QuadraticEquation(1,2,8);
		Qe.calculate();
		
		assertTrue((Qe.sol1 != null) || (Qe.sol2 !=null));
	}
	

}
