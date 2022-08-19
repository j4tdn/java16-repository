package condition.loop;

public class Ex05Testing {
	public static void main(String[] args) {
		//viết 1 hàm tìm max của 2 số a và b int
		System.out.println("Max" + max(2,4));
	}
	private static int max(int a, int b) {
		//toán tử 3 ngôi : N1 = (expression) ? N2 : N3
		
		/*if(a>b) {
			return a;
		}else return b;*/
		return a > b ? a : b;
	}
}
	