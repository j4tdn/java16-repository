package manager;

public class AppVehicle {
	public static void main(String[] args) {
		
		Vehicle user1 = new Vehicle("GDA", "vinfast", 50 , 250000);
		Vehicle user2 = new Vehicle("GDb", "vinfast", 500 , 250000);
		Vehicle user3 = new Vehicle("GDc", "vinfast", 250 , 250000);
		Vehicle user4 = new Vehicle("GDd", "vinfast", 500 , 250000);
		Vehicle user5 = new Vehicle("GDe", "vinfast", 150 , 250000);
		
		System.out.println("Ten chu xe  " + "  Loai xe  " + "  Dung tich  " + "  Tri gia  " + "  thue phai nop  ");
		System.out.println("==============================================================");
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);
		System.out.println(user4);
		System.out.println(user5);
		
		
		
		
		
	}

}
