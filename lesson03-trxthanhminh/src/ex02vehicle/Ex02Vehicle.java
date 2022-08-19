package ex02vehicle;

public class Ex02Vehicle {
	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle("Nguyễn Văn A", "Air Black");
		Vehicle v2 = new Vehicle("Trần Thị B", "Honda Cup");
		Vehicle v3 = new Vehicle("Lê Văn C", "Z1000");
		
		double dt1 = 50;
		double dt2 = 150;
		double dt3 = 1000;
		
		int value1 = 15000000;
		int value2 = 50000000;
		int value3 = 100000000;
		
		double taxval1 = 0.01;
		double taxval2 = 0.03;
		double taxval3 = 0.05;
		
		Tax t1 = new Tax(dt1, value1,taxval1);
		Tax t2 = new Tax(dt2, value2,taxval2);
		Tax t3 = new Tax(dt3, value3,taxval3);
		
		System.out.println("Tên chủ xe" + " " + "Loại xe"  + "\t" + "Dung tích" + "\t" + "Trị giá" + "\t" + "Thuế phải nộp");
		
		System.out.println("=================================================================================");
		
		System.out.println(v1 + "\t" + dt1 + "\t" + value1 + "\t" + t1.taxmul());
		System.out.println(v2 + "\t" + dt2 + "\t" + value2 + "\t" + t2.taxmul());
		System.out.println(v3 + "\t" + dt3 + "\t" + value3 + "\t" + t3.taxmul());

	}
}
