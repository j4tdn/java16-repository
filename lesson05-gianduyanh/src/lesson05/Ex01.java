package lesson05;

public class Ex01 {
	public static void main(String[] args) {
		
		System.out.println(isPowerOf(64, 4));
		
	}
	private static boolean isPowerOf(int a, int b) {
		
		for(int i = 0 ; i < a + b; i ++) {
			if(Math.pow(a, i) == b) {
				return true;
			}
			if(Math.pow(b, i) == a) {
				return true;
			}
			
		 }
		 return false;
		
		
		
		
	}

}
