package happynumber;

import java.util.HashSet;
import java.util.Set;

public class Ex01HappyNumber {
	public static void main(String[] args) {
		Integer number = 19;
		Set<Integer> hp = new HashSet<>();		
		sumOfSquares(number);
		while(true) {			
			if(hp.contains(number)) {		
				System.out.println("Number not a happy number!!!");
				break;
			}else {
				if(number == 1) {
					System.out.println("Number is a happy number!!!");
					break;
				}
				hp.add(number);				
			}
			number = sumOfSquares(number);
		}
	}
	
	private static Integer sumOfSquares(Integer number) {
//		Integer sum =(number/10)*(number/10)+(number%10)*(number%10);
		Integer sum =0;
		while(number!=0) {
			sum = number%10+sum;
			number/=10;
		}
		
		return sum;
	}
}
