package inheritance.multiple;

//Ke thua: 1 class khong the extends tu nhieu class
//Nguyen nhan: Class con khi ke thua tu class cha thi khong bat buoc override method tu cha
//TH khi cac class cha co ham giong nhau, luc nay con khong biet goi tu class cha nao

public class Child extends Dad {
	public static void main(String[] args) {
		Child son = new Child();
		son.cooking();
		son.playSport();
	}
}
