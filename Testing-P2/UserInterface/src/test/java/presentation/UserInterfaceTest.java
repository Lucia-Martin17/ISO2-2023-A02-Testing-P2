package presentation;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserInterfaceTest {

	@Test
	public void testOutputMessage() {
		Interface_CLI interfacecli=new Interface_CLI();
		interfacecli.outputMessage("This is an output test");
		assertTrue("Successful.",true);
	}

	@Test
	public void testOutputErrorMessage() {
		Interface_CLI interfacecli=new Interface_CLI();
		IllegalArgumentException exception = null;
		interfacecli.outputErrorMessage(exception);
		assertTrue("Successful.",true);
	}

	@Test
	public void testKeyboardInputDouble() {
		Interface_CLI interfacecli=new Interface_CLI();
		double testDouble=interfacecli.keyboardInputDouble("Write a 12");
		assertTrue(testDouble==12);
	}

}
