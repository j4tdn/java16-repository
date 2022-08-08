package condition.loop;

public class Ex05Testing {

	public static void main(String[] args) {
		//  Viết 1 hàm tìm max của 3 số a và b int
		System.out.println(maxOf3(1,2,3));

	}
	public static int maxOf3(int a, int b, int c) {
		return a>b||c>b?a>c?a:c:b;
	}

}
