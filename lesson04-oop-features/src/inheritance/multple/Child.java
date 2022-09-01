package inheritance.multple;

//khoong thể extends từ nhiều class
// nguyên nhân class con khi kế thừa từ class cha thì
// k bắt buộc overide method từ cha
//th khi các class cha có hàm giống nhau, luc này còn k biết gọi class cha nào
public class Child extends Dad{
	public static void main(String[] args) {
		Child son = new Child();
		son.cooking();
		son.playSport();
	}

}
