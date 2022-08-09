package operator;

public class Bx01BasicDemo {

	public static void main(String[] args) {
		int a = 6;
		int b = 3;
		int c = 8;
		a += b-- + c++ + ++c;
		System.out.println("A= " + a);
		b = a-- + ++b - ++c - b;
		System.out.println("B= " + b);
		c = ++c + b-- + c-- + --a;
		System.out.println("C= " + c);
		System.out.println("+==============+");
		//kiểm tra a b có phải bội của 5 ko
		boolean isPowerOf5 = (a % 5 == 0);
		System.out.println(a + "IspowerOf5: " + isPowerOf5);
		
		isPowerOf5 = (b % 5 == 0);
		System.out.println(b + "IspowerOf5: " + isPowerOf5);
		// kiểm tra số đó có phải số chẳn ko
		boolean isPowerOf2 = (a % 2 == 0);
		System.out.println(a + "IsPowerOf2: " + isPowerOf2);
		//kiểm tra số đó có phải bội củ 10 và < 100 ko
		boolean isValid = (a % 10 == 0 && a < 100);
		System.out.println(a + "isValid: " + isValid);
		b = 90;
		isValid = isPowerOf10AndLessThan100(b);
		System.out.println(b + "isvalid: " + isValid);
		// sử dùng câu lệnh if else cho x chia hết cho 10 và < 100 là hợp lệ và ngược lại
		if (isValid) {
			System.out.println("hop le");
		}else {
			System.out.println("ko hop le");
		}
		
	}
	private static boolean isPowerOf10AndLessThan100(int number) {
		return (number % 10 == 0 && number <100); 
	}

}
