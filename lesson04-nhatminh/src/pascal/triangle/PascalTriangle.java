package pascal.triangle;

import java.util.Scanner;
import java.util.Vector;

public class PascalTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = Integer.parseInt(sc.nextLine());
		pascalTriangle(n);
		sc.close();
	}

	public static void pascalTriangle(int n) {
		Vector<Integer> arr = new Vector<Integer>();
		while ((n--) != 0) {
			int beforeValue = 1, beforeValueClone;
			for (int i = 1; i < arr.size(); i++) {
				beforeValueClone = arr.get(i);
				arr.set(i, beforeValue + arr.get(i));
				beforeValue = beforeValueClone;
			}
			arr.add(1);
			for (Integer i : arr)
				System.out.print(i + " ");
			System.out.println();
		}
	}
}
