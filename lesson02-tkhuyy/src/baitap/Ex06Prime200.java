package baitap;

public class Ex06Prime200 {

	public static void main(String[] args) {
		
		
		int n = 2;
		int dem = 0;
		while (dem < 200) {
			n++;
			if (checkPrime(n)) {
				 dem++;
			}
		}
		System.out.println("Số nguyên tố thứ 200 la: " + n);

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