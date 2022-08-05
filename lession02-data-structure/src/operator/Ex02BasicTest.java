package operator;

// format code: ctrl shift f
public class Ex02BasicTest {
	public static void main(String[] args) {
		int i = 2;
		if (++i > 2 && i++ > 2) {
			i++;
		}
		if (i++ > 4 || ++i > 5) {
			System.out.println("i: " + i);
		}
		if (i++ < 4 || ++i > 5) {
			System.out.println("i: " + i);
		}

		// i = 8 ==> && & || | --> AND OR BIT
	}
}
