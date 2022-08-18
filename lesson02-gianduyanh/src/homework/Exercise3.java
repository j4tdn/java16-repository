package homework;

public class Exercise3 {
	public static void main(String[] args) {
		int number = 1221;
		if(reverse_num(number) == number) {
			System.out.println(number + " la so dao nguoc");
		}
		else {
			System.out.println(number + " khong phai la so dao nguoc");
		}
		
	}
	private static int reverse_num(int n){
	    int reverse = 0; 
	    while (n > 0) {
	        reverse = reverse * 10 + n % 10;
	        n /= 10;
	    }
	    return reverse;
	}

}
