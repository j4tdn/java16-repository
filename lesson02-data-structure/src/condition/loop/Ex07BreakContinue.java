package condition.loop;

public class Ex07BreakContinue {

	public static void main(String[] args) {
		// Trong cấu trục vòng lặp for, do while,...
		// break ---> Thoát khỏi vòng lặp ngay lập tức
		// continue ---> Thoát/kêt thuc sớm màn hình hiện tại
		
		for(int i = 0; i < 6; i++) {
			if(i == 2) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Finish");
	}

}
