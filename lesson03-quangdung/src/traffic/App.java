package traffic;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vehicle vh1 = new Vehicle("Nguyễn Thu Loan", "Future Neon", 100, 35000000);
		Vehicle vh2 = new Vehicle("Lê Minh Tính", "Ford Range", 3000, 250000000);
		Vehicle vh3 = new Vehicle("Nguyễn Minh Triết", "Landscape", 1500, 1000000000);

		System.out.println("Tên chủ xe" + "\t\t" + "Loại xe:" + "\t\t" + "Dung Tích" + "\t\t" + "Trị giá" + "\t\t"
				+ "Thuế phải nộp");

		System.out.println(
				"=====================================================================================================");

		System.out.println(vh1.getName() + "\t\t" + vh1.getType() + "\t\t" + vh1.getCapacity() + "\t\t\t"
				+ vh1.getCost() + "\t\t" + TaxUtils.taxPay(vh1));
		System.out.println(vh2.getName() + "\t\t" + vh2.getType() + "\t\t" + vh2.getCapacity() + "\t\t\t"
				+ vh2.getCost() + "\t\t" + (long)TaxUtils.taxPay(vh2));
		System.out.println(vh3.getName() + "\t" + vh3.getType() + "\t\t" + vh3.getCapacity() + "\t\t\t" + vh3.getCost()
				+ "\t\t" + (long)TaxUtils.taxPay(vh3));

	}

}
