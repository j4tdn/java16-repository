package operator;

public class Ex02BasicTest {
	public static void main(String[] args) {
		// formart code: ctrl shift f
		int i = 2;
		if (++i > 2 && i++ > 2) {
			i++;
		}
		if (i++ > 4 || ++i > 5) {
			System.out.println(i);
		}
		if (i++ < 4 || ++i > 5) {
			System.out.println(i);

		}
		// i = 8 --> & | --> AND OR BIT
		// & | thực hiện tất cả
		if (i++ > 20 & ++i > 5) {

		}
		System.out.println("i after: " + i);
	}

}
