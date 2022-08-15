package view;

public class Ex03Solution {
	public static void main(String[] args) {
		System.out.println(IsSymetric(123321));
		System.out.println(IsSymetric(1234444));
	}

	public static boolean IsSymetric(int number) {
		int temp = 0;
		int clone_number = number;
		while (number != 0) {
			temp = temp * 10 + number % 10;
			number /= 10;
		}
		return clone_number == temp;
	}
}
