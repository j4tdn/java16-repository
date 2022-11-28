package inhertance.multple;

//kế thừa: 1 class không thể extends từ nhiều class

//Nguyên nhân: Class con khi kế thừa từ class cha thig không bắt buộc override method từ cha
//TH khi các cái class cha có giống nhau, lúc này con không biết gọi từ class cha nào
//
public class Child extends Dad{
	public static void main(String[] args) {
		Child son = new Child();
		son.cooking();
		son.playSport();
	}
}
