package bean;

import java.util.HashSet;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
		int n = 44;
		System.out.println(happyNumber(n));
	}

	public static boolean happyNumber(int number) {
		Set<Integer> da = new HashSet<Integer>();
		while (da.add(number)) {
			int n = 0;
			while (number > 0) {
				n += Math.pow(number % 10, 2);
				number /= 10;
				
			
			}
			number = n;
		}
		if(number == 1) {
			return true;
		}
		return false;
	}

}
