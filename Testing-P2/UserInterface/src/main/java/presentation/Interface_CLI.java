package presentation;

import reading.Read;

public class Interface_CLI {

	public void outputMessage(String message) {
		System.out.println(message);
	}
	
	public void outputErrorMessage(IllegalArgumentException exception) {
		System.err.println(exception);
	}

	public double keyboardInputDouble(String message) {
		double input = Read.read_double(message);
		return input;
	}
}
