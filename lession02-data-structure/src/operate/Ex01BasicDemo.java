package operate;

public class Ex01BasicDemo {
	public static void main(String[] arges) {
		int a =10;
		int b=22;
		
		// = += -= *= /=
		a = a+b;
		b=b*4;
		b+=12;
		System.out.println("a " + a);
		System.out.println("b " + b);
		
		//int x=5;
		//int z=5
		//++(+=1) --(-=1)-->prefix(tiền tố) sufix(hậu tố)
		//tiền tố int y = 7 + ++x -->13
		//hậu tố int y =7 + z++ + ++z -->19
		System.out.println("a++ suffix " + (a++));//32
		System.out.println("++b prefix " + (++b));//101
		System.out.println("--a suffix " + (--a));//32
		System.out.println("b-- prefix " + (b++));// 101
		
		// == !=>=
		//1. kiểm tra 1 số có phải bội của 5 không?
		boolean isPowerOf5 = (a % 5==0);
		System.out.println(a + "isPowerOf5: " + isPowerOf5);
		isPowerOf5 = (b % 5==0);
		System.out.println(b + "isPowerOf5: " + isPowerOf5);
		
		//2. --------------------- là số chẵn không?
		boolean isPowerOf2 = (a%2 == 0);
		System.out.println("isPowerOf2: " + isPowerOf2);
		
		//3. ------------------------ bội của 10 và bé hơn 100 không?

		boolean isValid = (a%10==0 && a<100);
		System.out.println("isValid: " + isValid);
		
		b=90;
		isValid = isPowerOf10AndLessThan100(b);
		//Nếu số x mà chia hết cho 10 và bé hơn 100 thì sẽ in ra hợp lệ
		
		if(isValid) {
			System.out.println("không hợp lệ");
		}else {
			System.out.println("hợp lệ");
		}
		// HÀm--> phạm vi truy cập(public & private), static, kiểu trả về(boolean), tham số truyền vào
		
		
			
	}
	
	private static boolean isPowerOf10AndLessThan100(int number) {
		return ((number %100==0) &&( number<100));
	}

}
