package operator;

public class Ex01BasicDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 22;
		
//		a = a+ b;
//		b = b * 4;
//		b += 12;
//		System.out.println("a: "+a);
//		System.out.println("b: "+b);
//		
//		// ++(+=1) --(-=1) prefix(tiền tố), suffix(hậu tố)
//		// tiền tố: y = 7 + ++a -->y = 18
//		// hậu tố: y = 7 + a++ --> y = 17,a=11
//		// y = 7 + a++ + ++a --> y = 7 + 10(tăng lên 11) + 12
//		System.out.println("a++ suffix: " + a++);
//		System.out.println("++b prefix: " + ++b);
//		System.out.println("--a suffix: " + --a);
//		System.out.println("b-- prefix: " + b--);
//		System.out.println("b: "+b);
//		
//		int x = 7;
//		int z = 2;
//		int k = 3;
//		int v = x++ + --z + k++ + ++z - x-- - --k;
//		System.out.println("v: "+v);
//		z += z-- + z++ - --z + k++ + ++k;
//		System.out.println("Z: " + z);

		a = 30;
		b = 100;
//		1 .Kiểm tra 1 số có phải là bội của 5 không
		boolean isPowerOf5 = (a % 5 == 0);
		System.out.println(a + " isPowerOf5:" + isPowerOf5);
		
		isPowerOf5 = (b%5  == 0);
		System.out.println(b + " isPowerOf5:" + isPowerOf5);
		
//		2. Kiểm tra 1 số có phải là số chẵn không
		boolean isPowerOf2 = (a % 2 == 0);
		System.out.println("isPowerOf2: " + isPowerOf2);
//		3. Kiểm tra 1 số có phải là bội của 10 và bé hơn 100 không
		boolean isValid = isPowerOf10AndLessThan100(a);
		System.out.println("isValid: " + isValid);
		
		if(isValid)//isValid == true !isValid == false
		{
			System.out.println("hợp lệ");
		}
		else
		{
			System.out.println("không hợp lệ");
		}
		
	}
	// Hàm
	// --> phạm vi truy cập: private
	// --> static
	// kiểu trả về: boolean
	// tham số truyền vào: số đầu vào
	private static boolean isPowerOf10AndLessThan100(int number)
	{
		return number % 10 == 0 && number < 100;
	}
}
