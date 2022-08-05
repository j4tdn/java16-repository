package operator;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 22;
		
		a = a + b;
		b = b * 4;
		b+=12;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		// int x = 5;
		// prefix(tiền tố)
		// suffix(hậu tố)
		// tiền tố: int y = 7 + ++x --> 13
		// hậu tố: int y = 7 + z++ + ++z --> 12
		System.out.println("a++ suffix: " + (a++));
		System.out.println("++b prefix: " + (++b));
		
		int x = 7;
		int z = 2;
		int k = 3;
		
		z = z + z-- + z++ + k++ + ++z - x-- - --k;
		
		System.out.println("x = " + x);
		System.out.println("z = " + z);
		System.out.println("k = " + k);
		
		a = 32;
		b = 100;
		
		// 1. Kiểm tra một số có phải là bội của 5 ko
		boolean isPowerOf5 = isPowerOf10AndLessThan100(120);
		System.out.println(isPowerOf5);
		
		// Hàm --> phạm vi truy cập: private
		// static 
		// kiểu trả về: boolean
		// tham số truyền vào: số đầu vào
	}
	public static boolean isPowerOf10AndLessThan100(int number) {
		return number % 10 == 0 && number < 100;
	}
}
