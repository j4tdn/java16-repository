package exam01;

public class exponential {
	public static void main(String[] args) {
		//int a = 8, b=2;
		//int a = 2, b=8;
		int a = 6, b=2;
		//int a = 20, b=4;
		//int a = 64, b=4;
		System.out.println("Is: "  + numberExp(a, b));


		
	}
	private static boolean numberExp(int a, int b) {
		if(a<=0 && b<=0) {
			return false;
			
		}
		if(a<b) {
			double number = Math.log(b)/ Math.log(a);
			return Math.ceil(number) == Math.floor(number);
		}
		else {
			double numbers = Math.log(a) / Math.log(b);
			return Math.ceil(numbers) == Math.floor(numbers);
		}
	}
}
