package inheritance.multiple;
//kế thừa: 1 class k thê extends từ nhiều class
// Nguyên nhân: class con khi kế thừa từ class cha thì k bắt buộc override method từ cha
//TH khi các class cha có hàm giông nhau, lúc này con k biêt gọi từ lớp cha nào
public class Child extends Dad {
	public static void main(String[] args) {
		Child son = new Child();
		son.cooking();
		son.playSport();
		
	}
}
