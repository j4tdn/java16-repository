package polymorphism.method;

public class Ex01Overloading {
	public static void main(String[] args) {
		// tim tong 2 so, 3 so, n so - nguyen
		System.out.println("sum2 "+sum(4, 6));
		System.out.println("sum2 "+sum(4, 6, 9));
		System.out.println("sum2 "+sum(4, 6, 9, 28));
	}
	
	private static int sum (int... numbers) {
		int sum= 0;
		for (int number : numbers) {
			sum+= number;
		}
		return sum;
	}

}
