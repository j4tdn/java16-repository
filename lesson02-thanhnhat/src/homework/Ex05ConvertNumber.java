package homework;

public class Ex05ConvertNumber {
	public static void main(String[] args) {
		int n = 128;

		String num = "";
		while (n>0) {
			num = (n%2) + num;
			n/=2;
			
		}
		System.out.println("Số ở hệ cơ số 2: " + num );
	}
	

}
