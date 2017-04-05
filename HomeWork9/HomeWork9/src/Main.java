import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter number first -");
			double a = in.nextDouble();
			System.out.println("Enter number second");
			double b = in.nextDouble();
			System.out.println(div(a, b));
			in.close();
		} catch (InputMismatchException e) {
			System.out.println("Bad character");
		}
	}

	public static double div(double a, double b) {

		if (a == 0 || b == 0) {
			System.out.println("divide by zero can not be");

		}

		return a / b;

	}
}
