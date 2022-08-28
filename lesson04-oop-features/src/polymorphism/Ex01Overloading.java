package polymorphism;

public class Ex01Overloading {
	public static void main(String[] args) {
		//tìm tổng 2 , 3 hay nhiều số nguyên
System.out.println("sum: " + sumn(1, 2, 3, 4));
	}
	private static int sum (int a, int b) {
		return a+b;
	}
	private static int sumn (int ... numbers) {
		int sum=0;
		for(int number : numbers) {
			sum+=number;
		}
		return sum;
	}

}
