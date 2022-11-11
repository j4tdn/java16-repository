package ex02;

public class Ex02Matrix {
	public static void main(String[] args) {
		int[][] a = {{1,8,1,6},{2,2,3,1},{1,7,1,7},{2,1,3,1},{9,6,8,7}};
		for(int row = 0; row < a.length; row++) {
			for(int col = 0; col < a[row].length; col++) {
				System.out.print(a[row][col] + "    ");
			}
			System.out.println();
		}
		System.out.println("============");
		matrix(a);;
		
	}
	private static void matrix(int[][] a){
		int b = 0;
		int c = 0;
		for(int row = 0; row < a.length; row++) {   
			for(int col = 0; col < a[row].length; col++) {
				if(a[row][col] == 0) {
					b = row;
					c = col;
			    }
				
		    }
			
	    }for(int row = 0; row < a.length; row++) {
			for(int col = 0; col < a[row].length; col++) {
				a[row][c] = 0;
				a[b][col] = 0;
				System.out.print(a[row][col] + "    ");
			}
			System.out.println();
		}
		
		
	}
}