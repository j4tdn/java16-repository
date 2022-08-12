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
		
		// ++(+=1) --(-=1) --> prefix(tiền tố), suffix(hậu tố)
		//int x = 5;
		//int z = 5;
		// tiền tố: int y = 7 + ++x --> 13
		// hậu tố:  int y = 7 + z++ --> 12 
		// --> hậu tố: kết thúc phép toán mới thực hiện toán tử ++ hoặc --
		// --> tiền tố: thực hiện toán tử rồi mới thực hiện biểu 
		System.out.println("a++ suffix: " + (a++));
		System.out.println("++b prefix: " + (++b));
		
		//Ex ++ or --
		int x = 3; //2
		int y = 5; //6 -> 5 -> 6
		int z = 2; //3 -> 4 -> 3
		z += z++ - ++z + y++ + --x + --y + ++y + z--;
		// = z = z + ()
		// = z = 2 + 2 - 4 + 5 + 2 + 5 + 6 + 4 = 22
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("z: " + z);
		
		// == != >=
		// kiểm tra 1 số có phải là bội của 10 và bé hơn 100 
		b = 3;
		boolean isValid = isPowerOf10AndLessThan100(b);
		System.out.println("isValid: " + isValid);
		
		// nếu số X chia hết cho 10 và bé hơn 100 thì sẽ in ra dòng chữ là hợp lệ không

	}
	
	private static boolean isPowerOf10AndLessThan100(int number) {
		return number % 10 == 0 && number < 100;
	}

}
