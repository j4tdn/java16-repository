
public class Ex06 {
	public static void main(String[] args) {
		int n= 2;
		int count = 0;
		while (count <= 200) {
			n++;
			if (checkPrime(n)) {
				 count++;
			}
		}
		System.out.println("Số nguyên tố thứ 200 trong hệ thống số tự nhiên là: " + n);
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
