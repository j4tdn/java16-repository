package exam;

public class Ex01 {
	public static void main(String[] args) {
		int a=3;
		int b=8;
		if(isPowerOf(a, b)==true) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}
	private static boolean isPowerOf(int a, int b) {

		for(int i=1; i<100;i++) {
			if((Math.pow(a, i)==b)||(Math.pow(b, i)==a)) {
				return true;
			}

			
		}return false;
	}

}
