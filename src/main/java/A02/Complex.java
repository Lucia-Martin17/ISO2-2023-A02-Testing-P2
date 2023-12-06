package A02;

public class Complex {
	private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        setReal(real);
        setImaginary(imaginary);
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

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
