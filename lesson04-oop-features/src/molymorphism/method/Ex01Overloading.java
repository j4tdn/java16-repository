package molymorphism.method;

public class Ex01Overloading {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = 20;
		System.out.println(sum(new int[] {1,34,5,3,3}));
	}
	
	private static int sum(int a, int b) {
		return a + b;
	}
	
	private static int sum3Numbers(int a, int b, int c) {
		return a + b + c;
	}
	
	private static int sum(int[] numbers) {
		int sum = 0;
		for (int i : numbers) {
			sum+= i;
			
		}
		return sum;
	}
	
	

}
