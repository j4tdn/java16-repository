package condition.loop;

public class Ex07BreakContinue {
	public static void main(String[] args) {
		// trong cấu trúc vòng lặp(for, while, dowhile)
		// Break --> thoát khỏi vòng lặp ngay lặp tức
		// Continue --> thoát/kết thúc sớm vòng lặp hiện tại
		
		for (int i = 0; i < 5; i++) {
			if (i == 2) {
				// break; kq: 0 1
				continue; // kq: 0 1 3 4
			}
			System.out.println(i);
		}
		System.out.println("Finish...");
	}
}
