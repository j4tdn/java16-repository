package operator;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 22;
		
		// = += -= *= /=
		a = a + b;
		b = b * 4;
		b += 12;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		// int x = 5;
		// int z = 5;
		// ++(+=1) --(-=1) --> prefix, suffix
		// tiền tố(thực hiện tiền tố trước): int y = 7 + ++x --> 13
		// hậu tố(cộng 7 với z rồi mới tăng z): int y = 7 + z++ --> 12
		System.out.println("a++ suffix: " + (a++));
		System.out.println("++b prefix: " + (++b));
		System.out.println("--a suffix: " + (--a));
		System.out.println("b-- prefix: " + (b++));
		System.out.println("b: " + b);
		a = 32 ;
		b = 100;
		// == != >=
		// 1. Kiểm tra 1 số có phải là bội của 5 không
		boolean isPowerOf5 = (a % 5 == 0);
		System.out.println(a + " isPowerOf5: " + isPowerOf5);
		isPowerOf5 = (b % 5 == 0);
		System.out.println(b + " isPowerOf5: " + isPowerOf5);
		// 2. Kiểm tra 1 số có phải là số chẵn không
		boolean isPowerOf2 = (a % 2 == 0);
		System.out.println(a + " isPowerOf2: " + isPowerOf2);
		// 3. kiểm tra 1 số có phải là bội của 10 và < 100 không
		// && ||
		boolean isValid = isPowerOf10AndLessThan100(a);
		System.out.println(a + " isValid: " + isValid);
		
		b = 90;
		 isValid = isPowerOf10AndLessThan100(b);
		System.out.println(b + " isValid: " + isValid);
		
		//Biểu thức điều kiện
		/*
		if (biểu thức đúng sai) {
		    thực hiện nếu biểu thức đúng -- >Biểu thức trả về đúng
		 } else {
		    thực hiện biểu thức sai --> Biểu thức trả về false
		 }
		*/
		// if (booleanExpression) --> if (booleanExpression == true)
		// if (!booleanExpression) --> if (booleanExpression == false)
		if (!isValid ) {
			System.out.println("Số hợp lệ");
		} else {
			System.out.println("Số không hợp lệ");
		}
	}
	// Hàm
			// --> Phạm vi truy cập: private
			// --> static
			// kiểu trả về: boolean
			// tham số truyền vào
		private static boolean isPowerOf10AndLessThan100(int number) {
			return number % 10 == 0 && number < 100;
		}
		
	}

