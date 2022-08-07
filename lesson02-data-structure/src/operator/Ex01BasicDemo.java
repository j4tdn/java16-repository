package operator;

import java.util.Scanner;

public class Ex01BasicDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 22;

		a = a + b;
		b = b * 4;
		b += 12;
		
		System.out.println(a);
		System.out.println(b);
		
		//prefix(tiền tố) tăng 1 xong mới áp dụng
		//suffix(hậu tố) áp dụng xong mới tăng 1
		System.out.println("a++ suffix: "+ (a++)); //32
		System.out.println("++b prefix: "+ (++b)); //101
		
		System.out.println("--a suffix: "+ (--a)); //32
		System.out.println("b-- prefix: "+ (b--)); //101
		
		//ktra 1 số  có phải là bội của 5 không
		a=30;
		b=100;
		boolean isPowerOf5=(a%5==0);
		System.out.println(isPowerOf5);
		//ktra 1 số có phải là số chẵn không
		boolean isPowerOf2=(b%2==0);
		System.out.println(isPowerOf2);
		//3 ktra 1 số có phải là bội của 10 và bé hơn 100 không
		boolean isPowerOf10=(a%10==0 && a<100);
		System.out.println(isPowerOf10);
		
		boolean isvalid =isPowerOf10AndLessThan100(110);
		System.out.println(isvalid);
		
		//nếu mà số X mà chia hết cho 10 và bé hơn 100 thì in ra hợp lệ
		//Biểu thức điền kiện 
		/*if(biểu thức true or false){
		   thực hiện nếu biểu thức đúng
		}
		else nếu biếu thức thực hiện sai		
		*/
		//if(booleanExpression)-->if(booleanExpression==true)
		//if(!booleanExpression)-->if(booleanExpression==false)
		if(isvalid==true) {
			System.out.println("số hợp lệ");
		}
		else System.out.println("số không hợp lệ");
	}
	private static boolean isPowerOf10AndLessThan100(int number) {
		return number%100==0 && number<100;
	}
	

}
