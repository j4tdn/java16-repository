package Demo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {
	public static boolean isHappyNumber(int n) {
		Set<Integer> visited = new HashSet<>();
		while (n != 1 && !visited.contains(n)) {
			visited.add(n);
			int sum = 0;
			while (n > 0) {
				int digit = n % 10;
				sum += digit * digit;
				n /= 10;
			}
			n = sum;
		}
		return n == 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a non-zero integer number :");
		int number = sc.nextInt();
		System.out.println(isHappyNumber(number) ? "It is a Happy Number" : "It is an Unhappy Number");
	}
}
