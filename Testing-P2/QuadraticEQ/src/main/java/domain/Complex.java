	package domain;

/**
 * <p>
 * <b>Class:</b></br>
 * Complex.
 * </p>
 * 
 * <p>
 * <b>Description:</b></br>
 * The {@code Complex} class represents a complex number with real and imaginary
 * parts. It provides methods to set and get the real and imaginary parts, and a
 * method to generate a string representation of the complex number.
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
public class Complex {
	/**
	 * <p>
	 * <b>Attribute:</b></br>
	 * real.
	 * </p>
	 * <p>
	 * <b>Description:</b></br>
	 * Real part of a complex number.
	 * </p>
	 */
	private double real;
	/**
	 * <p>
	 * <b>Attribute:</b></br>
	 * imaginary.
	 * </p>
	 * <p>
	 * <b>Description:</b></br>
	 * Imaginary part of a complex number.
	 * </p>
	 */
	private double imaginary;

	/**
	 * <p>
	 * <b>Method:</b></br>
	 * Complex.
	 * </p>
	 * 
	 * <p>
	 * <b>Description:</b></br>
	 * Constructs a complex number with the specified real and imaginary parts.
	 * 
	 * @param real      The real part of the complex number.
	 * @param imaginary The imaginary part of the complex number.
	 */
	public Complex(double real, double imaginary) {
		setReal(real);
		setImaginary(imaginary);
	}

	/**
	 * <p>
	 * <b>Method:</b></br>
	 * getReal.
	 * </p>
	 * 
	 * <p>
	 * <b>Description:</b></br>
	 * Gets the real part of the complex number.
	 * 
	 * @return The real part of the complex number.
	 */
	public double getReal() {
		return real;
	}

	/**
	 * <p>
	 * <b>Method:</b></br>
	 * setReal.
	 * </p>
	 * 
	 * <p>
	 * <b>Description:</b></br>
	 * Sets the real part of the complex number.
	 * 
	 * @param real The new real part of the complex number.
	 */
	public void setReal(double real) {
		this.real = real;
	}

	/**
	 * <p>
	 * <b>Method:</b></br>
	 * getImaginary.
	 * </p>
	 * 
	 * <p>
	 * <b>Description:</b></br>
	 * Gets the imaginary part of the complex number.
	 * 
	 * @return The imaginary part of the complex number.
	 */
	public double getImaginary() {
		return imaginary;
	}

	/**
	 * <p>
	 * <b>Method:</b></br>
	 * setImaginary.
	 * </p>
	 * 
	 * <p>
	 * <b>Description:</b></br>
	 * Sets the imaginary part of the complex number.
	 * 
	 * @param imaginary imaginary The new imaginary part of the complex number.
	 */
	public void setImaginary(double imaginary) {
		this.imaginary = imaginary;
	}

	/**
	 * <p>
	 * <b>Method:</b></br>
	 * toString.
	 * </p>
	 * 
	 * <p>
	 * <b>Description:</b></br>
	 * Returns a string representation of the complex number.
	 * 
	 * @return A string representation of the complex number.
	 */
	@Override
	public String toString() {
		String complx = "";
		if (imaginary > 0) {
			complx = String.format("%.4f+%.4fi", real, imaginary);
		} else if (imaginary == 0) {
			complx = String.format("%.4f", real);
		} else {
			complx = String.format("%.4f%.4fi", real, imaginary);
		}
		return complx;
	}
}