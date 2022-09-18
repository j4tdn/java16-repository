package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01DateOfBirthTryCatch {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);	
		
		//NumberFormatException
		//xử lí ngoại lệ
		//Cách 2: tiền xử lí - Đảm bảo dữ liệu chính xác để không bao giờ xảy ra ngoại
		// lệ khi thực thi
		
		//Cách 2: sử dụng khối try/catch để bắt ngoại lệ --> chương trình tiếp tục thực
		// thi khi ngoại lệ xảy ra
		//lưu ý: nên dùng chính xác exception xảy ra trong catch
		//khi khối try bị nhiều exception --> sử dụng exception cha để cover(bắt)
		int yob = 0;
		do {
			try {
				System.out.println("Enter year of birth: ");
				yob = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("NFE --> error");
				e.printStackTrace();
			}
		} while(true);
		
		
		
		int curYear = Year.now().getValue();		
		System.out.println("He is " + (curYear - yob + 1) + " years old");
		
		ip.close();
	}

}
