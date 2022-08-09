package datastructure;

public class Ex04Test {
	public static void main(String[] args) {
		int a = 12;
		Update(a);
		System.out.println("a3: " + a); // 12
	}

	private static void Update(int a) {
		System.out.println("a1: " + a); // 99
		a = 99;
		System.out.println("a2: " + a); // 12
	}
}
