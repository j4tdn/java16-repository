package condition;

public class Ex05Testing {
	public static void main(String[] args) {
		// viết chương trnhf tìm mã của 2 số a và b
		System.out.println("max: "+max(2,4));
	}

	private static int max(int a,int b) {
		//Toán tử 3 ngôi
		//N1 = (expression) ? N2 : N3;
		return a>b?a:b;
	}
}