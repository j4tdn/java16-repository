package homework;

public class Ex01PowerOf2 {
public static void main(String[] args) {
	
	int []numbers = {2,4,6,8,16,20,128,100};
	for(int number :numbers) {
		System.out.println(number + "==>" +isPowerOf2(number));
	}
	
	
}
	private static boolean isPowerOf2(int number) {
		while(number!=2) {
			if(number %2==0) {
				return false;
			}
			number /=2;
		}
		return true;
	}
}
