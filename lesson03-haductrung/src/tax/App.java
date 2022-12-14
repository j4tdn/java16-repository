package tax;

public class App {
	public static void main(String[] args) {
		Owner o1 = new Owner("Nguyễn Thu Loan");
		Owner o2 = new Owner("Lê Minh Tính");
		Owner o3 = new Owner("Nguyễn Minh Triết");

		VehicleDetail v1 = new VehicleDetail("Future Neo", 100, 35000000);
		VehicleDetail v2 = new VehicleDetail("Ford Ranger", 3000, 250000000);
		VehicleDetail v3 = new VehicleDetail("Land Scape", 1500, 100000000);

		Information i1 = new Information(o1, v1);
		Information i2 = new Information(o2, v2);
		Information i3 = new Information(o3, v3);

		System.out.println("Tên chủ xe" + "\t\t" + "Loại xe"+"\t\t"+"Dung tích"+"\t\t"+"Trị giá"+"\t\t"+"Thuế phải nộp");
		System.out.println("================================================================================================");
		System.out.println(o1.getName()+"\t\t\t\t"+v1.getVehicleType()+"\t\t"+v1.getCapacity()+"\t\t"+v1.getCost()+"\t\t\t\t"+VehicleUltils.tax(i1));
		System.out.println(o2.getName()+"\t\t\t\t"+v2.getVehicleType()+"\t\t"+v2.getCapacity()+"\t\t"+v2.getCost()+"\t\t\t\t"+VehicleUltils.tax(i2));
		System.out.println(o3.getName()+"\t\t\t"+v3.getVehicleType()+"\t\t"+v3.getCapacity()+"\t\t"+v3.getCost()+"\t\t\t\t"+VehicleUltils.tax(i3));
	}

}
