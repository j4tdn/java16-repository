package view;

public class Bai6 {
	public static void main(String[] args) {
		int n = 1000;
		soNguyenTo(n);
		int x=0;
		
			if( soNguyenTo(n) == true) {
				x++;
				if(x==199) {
					System.out.println(i);
				}
			}
	
	}
	private static boolean soNguyenTo(int n) {
		if(n<2) {
			return false;
		}
		
		for (int i = 3; i <n; i++) {
			if (n%i == 0) {
				return false;
				
			}
			
		}
		return true;
	
}
}