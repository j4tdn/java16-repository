package Operator;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 22;
		//= += -= *= /= == !=
		a= a + b;
		b= b * 4;
		b += 12;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		//int x=5, int z=5
		//++(+=1) --(-=1)--> tiền tố, suffix(hậu tố )
		//tiền tố int y =7 + ++x -->13
		System.out.println("a++ suffix: " + (a++));
		System.out.println("++b prefix: " + (++b));
		System.out.println("--a prefix: " + (--a));
		System.out.println("b-- suffix: " + (b--));
		System.out.println("b: " +b);
		int x = 7;
		int z = 2;
		int k =3;
		b=90;
		// kiểm tra 1 số có phải là bội của 5 khong
		boolean isPowerof5= isPowerOf10AndLessThan100(a);
		System.out.println("isPowerof5: " + isPowerof5);
		
		// kiểm tra 1 số phải là số chẵn không
		boolean isPowerof2= isPowerOf10AndLessThan100(a);
		System.out.println("isPowerof2: " + isPowerof2);
		isPowerof2= (b % 2 == 0);
		System.out.println("isPowerof2: " + isPowerof2);
		// kiểm tra 1 số phải là bội của 10 và bé hơn 100
		boolean isValid=( a % 10 ==0 && a<100);
		System.out.println("isValid " + isValid);
		// Hàm
		// phạm vi truy cập private
		// static
		// kiểu trả về boolean
		// tham số truyền vào
		if(isValid == true) {
			System.out.println("số hợp lệ");
			}
		else {
			System.out.println("không hợp lệ");
		}
		}
	private static boolean isPowerOf10AndLessThan100(int number) {
		return number % 10 == 0 && number < 100;
			

	}
	
}
