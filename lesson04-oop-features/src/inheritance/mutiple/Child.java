package inheritance.mutiple;

// kế thừa: 1 class không thể extend nhiều class
//nguyên nhân: class con khi kế thừa class cha thì không bắt buộc override method từ cha
//TH các class cha có hàm giống nhau lúc nhày con không biết kế thừa từ class nào

public class Child extends Dad {
	public static void main(String[] args) {
		Child son= new Child();
		son.cooking();
		son.playSport();
	}

}
