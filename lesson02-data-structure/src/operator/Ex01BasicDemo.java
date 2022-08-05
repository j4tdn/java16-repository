package operator;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 22;
		int x = 4;
		int y = 8;
		
		//=  +=  -=  *=  /=
		a = a+b;
		b = b*4;
		b += 12;
		System.out.println("a:  "+a);
		System.out.println("b:  "+b);
		
		// ++(+=1) --(-=1) --> prefix, sufix
		System.out.println("a++ suffix: "+ (a++));
		System.out.println("++b suffix: "+ (++b));
		System.out.println("--a suffix: "+ (--a));
		System.out.println("b-- suffix: "+ (b--));
		
		System.out.println("y: "+ (y+=y++ - ++x + x-- + y-- - --y));
		
		
		// == != >=
		// 1. kiểm tra 1 số có phải là bội của 5 ko 
		boolean isPowerOf5 = (a % 5 == 0);
		System.out.println(a +"isPowerOf5: "+ isPowerOf5);		
		 isPowerOf5 = (b % 5 == 0);
		System.out.println(b +"isPowerOf5: "+ isPowerOf5);
		
		// 2. kiểm tra 1 số có phải là số chẵn ko
		boolean isPowerOf2 = (a % 2 == 0);
		System.out.println(a +"isPowerOf2: "+ isPowerOf2);		
		 isPowerOf2 = (b % 2 == 0);
		System.out.println(b +"isPowerOf2: "+ isPowerOf2);
		
		// 3. kiểm tra 1 số có phải là bội của 10 và bé hơn 100 ko 
		boolean isValid = (a % 10 == 0 && a<100);
		System.out.println(a +"isValid: "+ isValid);		
		 isValid  = isPowerOf10AndLessThan100(b) ;
		System.out.println(b +"isValid: "+ isValid);
	}


//  Hàm 
//--> phạm vi truy cập: private
//--> static, 
//--> kiểu trả về: boolean
//--> tham số truyền vào: số đầu vào 


private static boolean isPowerOf10AndLessThan100(int number) {
	return ((number % 10 == 0) && (number < 100));
}
}
