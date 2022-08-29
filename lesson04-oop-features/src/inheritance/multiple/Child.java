package inheritance.multiple;

/*
 * Kế thừa ko thể extends từ nhiều class
 * 
 * Nguyên nhân: Class con khi kế thừa từ class cha thì 
 * ko bắt buộc override method từ cha
 * 
 * Trong TH các hàm cha có hàm giống nhau, lúc này con ko biết gọi từ class cha nào
 */
public class Child extends Dad{
	public static void main(String[] args) {
		Child son = new Child();
		son.cooking();
		son.playSport();
	}
}
