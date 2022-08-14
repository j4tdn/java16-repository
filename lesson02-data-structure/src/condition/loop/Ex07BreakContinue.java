package condition.loop;

public class Ex07BreakContinue {

	public static void main(String[] args) {
		// continue -> thoat/ket thuc som vong lap hien tai
		
		for(int i = 0; i < 5; i++) {
			if(i == 2) {
				// break; 0 1
				continue;
			}
			System.out.println(i);
		}

	}

}
