package inheritance.multiple;

// Kế thừa: một class không thể kế thừa từ nhiều class
// Nguyên nhân: 1 Class con khi kế thừa từ Class cha không bắt 
// buộc phải override các methods từ cha
// TH khi các class cha có hàm giống nhau, lúc này không biết gọi
// từ class cha nào
public class Child extends Dad {
	public static void main(String[] args) {
		Child son = new Child();
		son.cooking();
		son.playSport();
	}
}
