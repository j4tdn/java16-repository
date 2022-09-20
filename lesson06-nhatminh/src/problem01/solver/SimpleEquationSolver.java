package problem01.solver;

import java.util.Scanner;

import problem01.exception.InvalidCoefficientException;

public class SimpleEquationSolver {
	public static void main(String[] args) {
		System.out.println("Result: " + solveSimpleEquation());
	}

	private static float solveSimpleEquation() {
		Scanner sc = new Scanner(System.in);
		int a, b;
		do {
			try {
				System.out.print("Enter a: ");
				a = Integer.parseInt(sc.nextLine());
				if (a == 0)
					throw new InvalidCoefficientException();
				System.out.print("Enter b: ");
				b = Integer.parseInt(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Invalid number format!!!\n");
			} catch (InvalidCoefficientException e) {
				System.out.println(e.getMessage() + "\n");
			}
		} while (true);
		sc.close();
		return (float) -b / a;
	}
}
