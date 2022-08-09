package homework;

public class Exercise6 {
	public static void main(String[] args) {
		int n = 1300;
		int cout = 0;
		for(int i = 2 ; i < n ; i ++) {
			if(isPrimeNumber(i)==true) {
				cout++;
				if(cout == 200) {
					System.out.println("so nguyen to thu 200 la " + i);
				}
			}
			
		}
		System.out.println("co bao nhieu so nguyen to tu 1 den 1300 :" +cout);
		
		
	}
	public static boolean isPrimeNumber(int n) {    
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
