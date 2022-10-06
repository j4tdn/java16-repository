package view;

public class Ex06Ncc {
	public static void main(String[] args) {
		
		System.out.println(sum(100));
	}
	private static int sum(long n ) {
		if(n == 0) return 4;
		if(n == 1) return 7;
		if(n == 2) return 5;
		
		return sum(n-1) + sum(n-2) + sum(n-3);
		
		
		
	}

}
