package Ex03;

import java.util.Scanner;

public class Pascal {
	public static void main(String[] args) {
		int h;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter hight: ");
		h = scanner.nextInt();
		int x, output;
//5
		for (int i = 1; i <= h; i++) {
			for (int j = 0; j <= 2 * h; j++) {
				x = j - h;
				if (x < 0) {
					x *= -1;
				}
				output = i - x;

				if (output > 0) {
					System.out.printf("%3d", output);

				}
			}
			System.out.println();

		}

	}

}
