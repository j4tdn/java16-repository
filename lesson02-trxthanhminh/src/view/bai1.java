package view;

// class name: noun
// method name: [phase]verb
// naming convention: camel case
// first letter of class --> Upper
// first letter of variable, method --> lower
// package-name: lower
// project-name: lower
// Bài 1: Viết chương trình kiểm tra 1 số có phải là lũy thừa của 2 hay không

public class bai1 {
	public static void main(String[] args) {
		int[] numbers = {0, 2, 4, 8, 9, 12, 16, 20, 32, 100, 128};
		
		for (int number: numbers) {
			System.out.println(number + " ==> " + isPowerOf2(number) );
		
		}
		
}
	private static boolean isPowerOf2(int number) {
		if(number <= 0) {
			return false;
		}
		while(number != 1) {
			if(number %2 != 0) {
			return false;
		}
		number /= 2;
		}
	return true;
	}
}
	
