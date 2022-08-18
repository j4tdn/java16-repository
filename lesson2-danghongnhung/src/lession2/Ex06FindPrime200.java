package lession2;

public class Ex06FindPrime200 {

	public static void main(String[] args) {
		int k = 0, n=2;
		while(k < 200) {
			if(checkPrime(n))
			{
				k++;
				if(k<200)
					n++;
			}
            else{ 
            		n++;	    		
            }
		}
		System.out.println(n);
		
	}
	private static boolean checkPrime(int n) {
		if(n < 2) 
			return false;
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) 
				return false;
		}
		return true;
	}
}
