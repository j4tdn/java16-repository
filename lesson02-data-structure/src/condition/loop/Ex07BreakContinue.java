package condition.loop;

public class Ex07BreakContinue {
	public static void main(String[] args) {
		// trong cau truc vong lap(for, while, dowhile)
		// break -> thoat khoi vong lap ngay lap tuc
		// continue -> thoat/ket thuc som vong lap hien tai
		for (int i = 0; i < 5; i++) {
			if (i == 2)
				// break;// 0 1
				continue;// 0 1 3 4
			System.out.println(i);
		}
		System.out.println("Finished...");
	}
}
