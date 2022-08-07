package operator;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 22;
		// = += -= *= /=
		a = a + b;
		b = b * 4;
		b += 12;
		System.out.println("a" + a);
		System.out.println("b" + b);
		System.out.println("a++ suffix:" + (a++));
		System.out.println("++b prefix:" + (++b));
		System.out.println("b-- suffix:" + (b++));
		System.out.println("b:" + b);
		int x = 7;
		int z = 2;
		int k = 3;
		// int v = x++ + --z + k++ + ++z -x-- - --k;
		z = z + z-- + z++ - --z + k++ + ++k;
		System.out.println("x:" + x);
		System.out.println("z:" + z);
		System.out.println("k:" + k);
		// System.out.println("v:" +v);

		// int x=5;
		// int z=5
		// ++(+=1) --(-=1)-->prefix(tiền tố), suffix(hậu tố)
		// tiền tố:int y=7+ ++x-->13
		// hậu tố: int y=7+ z++ + ++z --> 19

		// == != >=
		// 1.kiểm tra 1 số có phải là bội của 5 không
		boolean isPowerOf5 = (a % 5 == 0);
		System.out.println(a + "isPowerOf5:" + isPowerOf5);
		isPowerOf5 = (b % 5 == 0);
		System.out.println(b + "isPowerOf5:" + isPowerOf5);

		// 2. kiểm tra 1 số có phải là số chẵn không
		boolean isPowerOf2 = (a % 2 == 0);
		System.out.println(a + "isPowerOf2:" + isPowerOf2);
		// && ||
		// 3.kiểm trta 1 số có phải là bội cảu 10 và bé hơn 100 không
		boolean isValid = (a % 10 == 0 && a < 100);
		System.out.println("isValid:" + isValid);
		b = 90;
		isValid = isPowerOf10AndLessThan100(b);
		System.out.println("isValid:" + isValid);
		boolean isVaid = false;
		// Nếu mà số x mà chia hết cho 10 và bé hơn 100 thì se in ra dong chữ là hợp lệ
		// Biểu thức điều kiện
		/*
		 * If( biểu thức đúng sai){ thực hiện nếu biểu thức đúng --> BT trả về true }
		 * else Thực hiện nếu biểu thức sai-> BT trả về false }
		 */
		if (isVaid) {
			System.out.println("số hợp lệ");
		} else {
			System.out.println("số hợp lệ");
		}
		int i = 2;
		if (++i > 2 && i++ > 2) {
			i++;
		}
		if (i++ > 4 || ++i > 5) {
			System.out.println(i);
		}
		if (i++ < 4 || ++i > 5) {
			System.out.println(i);
		}
		//i=8==> AND or BIT
		if (i++ >5||++i>20) {
			System.out.println("i after:"+i);}
		
			System.out.println("i after after:"+i);}
		

	
	// Hàm
	// --> phạm vi truy cập:private
	// -->static
	// kiểu trả về: boonlean
	// tham số truyền vào: số đầu vào
	private static boolean isPowerOf10AndLessThan100(int number) {

		return number % 10 == 0 && number < 100;

	}
}
