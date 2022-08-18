package Ex02Vehicle;

import bean.Vehicle;

public class App {
	public static void main(String[] args) {
		Vehicle ve1 = new Vehicle("Nguyễn Thu Loan","Future Neo",100,35000000);
		Vehicle ve2 = new Vehicle("Lê Minh Tính","Ford Ranger",3000,250000000);
		Vehicle ve3 = new Vehicle("Nguyễn Minh","Landscape",1500,1000000000);
		
		System.out.println("Tên chủ xe"+"\t\t"+"Loại xe:"+"\t\t"+"Dung Tích"+"\t\t"+"Trị giá"+"\t\t"+"Thuế phải nộp");
		System.out.println("=====================================================================================================");
		ve1.showInfo();
		ve2.showInfo();
		ve3.showInfo();
	}
}
