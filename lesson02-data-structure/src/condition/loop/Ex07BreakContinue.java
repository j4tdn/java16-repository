package condition.loop;

public class Ex07BreakContinue {
	public static void main(String[] args) {
		for (int i = 0 ; i < 5 ; i++) {
			if( i == 2) {
				//beak ; 0 1
				continue;
			}
			System.out.println(i);
		}
	}
}
