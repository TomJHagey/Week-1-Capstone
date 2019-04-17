import java.util.Scanner;

public class MethodCalc {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		System.out.printf("Enter a number: ");
		int num1 = scnr.nextInt();

		System.out.printf("Enter another number: ");
		int num2 = scnr.nextInt();

		System.out.println("\nThe two numbers multiplied: " + mult(num1, num2));
		System.out.println("The two numbers added: " + add(num1, num2));
		System.out.println("The two numbers subtracted: " + sub(num1, num2));
		System.out.println("The two numbers divided: " + div(num1, num2));

		System.out.println("\nEnter a number: ");
		int num3 = scnr.nextInt();

		System.out.println("This number squared: " + square(num3));
		System.out.println("This number cubed: " + cube(num3));
		System.out.println("This number's 4th root: " + fourth(num3));

		scnr.close();
	}

	private static int mult(int a, int b) {
		int multTwoNums = a * b;

		return multTwoNums;

	}

	private static int add(int a, int b) {
		int addTwoNums = a + b;

		return addTwoNums;
	}

	private static int sub(int a, int b) {
		int subTwoNums = a - b;

		return subTwoNums;
	}

	private static double div(double a, double b) {
		double divTwoNums = a / b;

		return divTwoNums;
	}

	private static int square(int a) {
		int squareNum = a * a;

		return squareNum;

	}

	private static int cube(int a) {
		int cubeNum = a * a * a;

		return cubeNum;
	}

	private static int fourth(int a) {
		int rootFour = a * a * a * a;

		return rootFour;

	}

}