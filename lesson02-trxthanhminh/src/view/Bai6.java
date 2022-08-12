package view;

public class Bai6 {
	public static void main(String[] args) {
		int n = 1000;
		soNguyenTo(n);
		
		for (int count = 0; count<= n /2; count++) {
			if(count == 200) {
				count = soNguyenTo(n);
			}
	}
	}
	private static int soNguyenTo(int n) {
		boolean snt = false;
		for (int i = 0; i <= n/2; i++) {
			if (n%i == 0) {
				snt = true;
				break;
			}
		}
	}
}