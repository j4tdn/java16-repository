package polymorphism.method;

public class Ex01Overloading {
	public static void main(String[] args) {
		// Tìm tổng 2 số , 3 số , n số - nguyên;
		int a = 10; 
		int b = 5;
		int c = 20;
		System.out.println(+ sum(2,3,3));
		System.out.println(+ sum(3,4,7));
		System.out.println(+ sum(4,6,8));
	}

	// khai báo gọn
	private static int sum(int... numbers) {
		int sum = 0;
		for(int number: numbers) {
			sum+=number;
		}
		return sum;
	}
}
