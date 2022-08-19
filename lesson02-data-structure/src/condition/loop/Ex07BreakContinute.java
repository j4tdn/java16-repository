package condition.loop;

public class Ex07BreakContinute {
	public static void main(String[] args) {
		// brak --> thoát khỏi vòng lặp ngay lập tức
		// continute --> thoát/kết thúc sớm vòng lặp hiện tại
		for(int i=0;i<5;i++) {
			if(i ==2){
				//break;// 0 1
				continue;// 0 1 3 4
			}
			System.out.println(i);
		}
		
		System.out.println("Finished...");
		
		
		
	}
}
