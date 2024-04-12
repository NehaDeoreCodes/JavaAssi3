package assignments3;

import java.util.Scanner;

class Complex {
	private double real;
	private double imaginary;

	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public Complex add(Complex other) {
		double realSum = this.real + other.real;
		double imaginarySum = this.imaginary + other.imaginary;
		return new Complex(realSum, imaginarySum);
	}

	public Complex subtract(Complex other) {
		double realDifference = this.real - other.real;
		double imaginaryDifference = this.imaginary - other.imaginary;
		return new Complex(realDifference, imaginaryDifference);
	}

	public Complex multiply(Complex other) {
		double realProduct = (this.real * other.real) - (this.imaginary * other.imaginary);
		double imaginaryProduct = (this.real * other.imaginary) + (this.imaginary * other.real);
		return new Complex(realProduct, imaginaryProduct);
	}

	public void display() {
		System.out.println(this.real + " + " + this.imaginary + "i");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter real part of first complex number:");
		double real1 = scanner.nextDouble();
		System.out.println("Enter imaginary part of first complex number:");
		double imaginary1 = scanner.nextDouble();

		System.out.println("Enter real part of second complex number:");
		double real2 = scanner.nextDouble();
		System.out.println("Enter imaginary part of second complex number:");
		double imaginary2 = scanner.nextDouble();

		Complex complex1 = new Complex(real1, imaginary1);
		Complex complex2 = new Complex(real2, imaginary2);

		Complex sum = complex1.add(complex2);
		Complex difference = complex1.subtract(complex2);
		Complex product = complex1.multiply(complex2);

		System.out.println("Sum:");
		sum.display();
		System.out.println("Difference:");
		difference.display();
		System.out.println("Product:");
		product.display();

		scanner.close();
	}
}
