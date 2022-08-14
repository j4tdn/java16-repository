package condition.loop;

public class Ex05Testing {
	public static void main(String[] arges) {
		//viết 1 hàm tìm 2 max 2 số a b
		System.out.println("số lớn " + max(2, 4));
		
	}
	private static int max(int a, int b) {
		//Toán tử 3 ngôi:N1 =(expression)? N2:N3
		/*
		 * sử dụng khi N2 và N3 đơn giản(ít biểu thức code)
		 * if(expression){
		 * N1=N2;
		 * }else{Ơ
		 * N1=N3;
		 * }
		 */
		return a>b ? a : b;
		//if(a<b) {
			//return a;
		//}
		//return b;
	}

}
