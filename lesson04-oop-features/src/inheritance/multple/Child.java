package inheritance.multple;

//Ke thua: 1 class khong the extends tu nhieu class
//nguyen nhan: class con khi ke thua tu class cha thi 
//khong bat buoc overide method tu cha
//TH khi cac class cha co ham giong nhau , luc nay con khong biet goi tu class cha nao
public class Child extends Dad{
	public static void main(String[] args) {
		Child son = new Child();
		son.cooking();
		son.playSport();
		System.out.println("");
	}
}