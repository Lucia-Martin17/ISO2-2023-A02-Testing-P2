package domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestQuadraticEquationEachUse {
	
	@Test
	public void testCaseOne() throws IllegalArgumentException{
		switch(generalTest(2,1,1,"-0,2500+0,6614i","-0,2500-0,6614i")) {
		case 1:
			assertTrue("Incorrect parameter initialization.", false);
		case 2:
			assertTrue("Incorrect result.", false);
		case 3:
			assertTrue("Success.", true);
		}
	}
	
	@Test
	public void testCaseTwo() throws IllegalArgumentException {
		try {
			switch(generalTest(0,1,1,"-0,2500+0,6614i","-0,2500-0,6614i")) {
			case 1:
				assertTrue("Incorrect parameter initialization.", false);
			case 2:
				assertTrue("Incorrect result.", false);
			case 3:
				assertTrue("Should not be a result.", false);
			}
		}catch(IllegalArgumentException iae) {
			assertTrue("Success.", true);
		}
	}
	
	@Test
	public void testCaseThree() {
		try {
			switch(generalTest(Double.MAX_VALUE,Double.MAX_VALUE,Double.MAX_VALUE,"inf","inf")) {
			case 1:
				assertTrue("Incorrect parameter initialization.", false);
			case 2:
				assertTrue("Incorrect result.", false);
			case 3:
				assertTrue("Should not be a result.", false);
			}
		}catch(Exception e) {
			assertTrue("Success.", true);
		}
	}
	
	public int generalTest(double cA, double cB, double cC, String sol1, String sol2) throws IllegalArgumentException {
		double coefficientA=cA;
		double coefficientB=cB;
		double coefficientC=cC;
		
		QuadraticEquation qe= new QuadraticEquation(coefficientA,coefficientB,coefficientC);
		boolean correctParameters=qe.getCoefficientA()==cA&&qe.getCoefficientB()==cB&&qe.getCoefficientC()==cC;
		if(!correctParameters)
			return 1;
		
		qe.calculate();
		if(!qe.getSol1().toString().contains(sol1) || !qe.getSol2().toString().contains(sol2))
			return 2;
					
		return 3;
	}
}
