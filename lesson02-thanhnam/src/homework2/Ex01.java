package homework2;
// Viết chương trình kiểm tra 1 số có phải là lũy thừa của 2 hay không 
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		//2^x = number --> x a là số nguyên
		Scanner num = new Scanner(System.in);
		System.out.println("Input Number: ");
		int number = num.nextInt();
		if(numberOfTwo(number)== true) {
			System.out.println(number+ "is power of two");
		}else System.out.println(number + "isn't power of two");
	}
	private static boolean numberOfTwo(int number) {
		if(number==0) {
			return false;
		}
		if(number==1) {
			return true;
		}
		while(number>=2) {
			if(number % 2 !=0) {
				return false;
		}
		number = number/2;
		}
		return true;
		/* while(number != 1){
		 if(number % 2 !=0){
		 	return false;
		}
		number /=2;
		}
		return true;*/
	}	
}