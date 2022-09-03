package polymorphism.method;

public class Ex01Overloading {
	public static void main(String[] args) {
		//tìm tổng 2 , 3 hay nhiều số nguyên
System.out.println("sum: " + sum(1, 2, 3, 4));
System.out.println("sum: " + sum( 3, 4));
System.out.println("sum: " + sum(1, 2, 3));//new int[] {1,2,3,4}
	}
	private static float sum (float a, float b) {//nếu 2 hàm trùng tên nhưng khác số lượng tham số hoặc 
		return a+b;//khác kiểu dữ liệu truyền gọi là hàm overloading
	}
	
	private static int sum (int a, int b) {
		return a+b;
	}
	private static int sum (int a, int b, int c) {
		return a+b+c;
	}
	private static int sum (int ... numbers) {// sum(int[] number
		int sum=0;
		for(int number : numbers) {
			sum+=number;
		}
		return sum;
	}

}
