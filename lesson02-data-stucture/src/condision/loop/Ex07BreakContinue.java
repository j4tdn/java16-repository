package condision.loop;

public class Ex07BreakContinue {
public static void main(String[] args) {
	//break--> thoát khỏi vòng lặp ngay lập tức
	//continue--> thoát/ kết thúc sớm vòng lặp hiện tại
	for(int i=0; i<5;i++) {
		if(i==2) {
		continue;
		}
		System.out.println(i);
		}
	System.out.println("Finished...");
	}

}

