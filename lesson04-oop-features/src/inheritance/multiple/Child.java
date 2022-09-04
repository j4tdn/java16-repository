package inheritance.multiple;

//Kế thừa: class ko thể extends từ nhiều class
//Nguyên nhân: class con khi kế thừa từ class cha thì ko bắt buộc override method từ cha
//TH khi các class cha có hàm giống nhau, lúc này con ko biết gọi từ class cha nào

public class Child extends Dad{
	public static void main(String[] args) {
		Child child = new Child();
		child.cooking();
		child.playSport();
	}

}
