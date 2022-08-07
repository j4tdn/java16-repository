package datastructure;
// Chỉ import type khi khác package 
import bean.Item;

public class Ex06ObjectDeclaration {
	public static void main(String[] args) {
//		Khai báo KDL nguyên thủy
//		number, itemA: biến, tham chiếu -> luôn nằm ở stack
//		giá trị ở KNT -> stack
		int number = 57;
		System.out.println(number);
		
//		Khai báo KDL đối tượng => default: null
//		giá trị lưu trị ở HEAP
//		Tạo ra 1 ô nhớ heap với các thuộc tính mang giá trị mặc định
//		Tạo biến ở stack itemA và gán itemA địa chỉ ô nhớ heap chứa thuộc tính trên
		Item itemA = new Item(101, "Item A", 220);
		Item itemB = new Item(102, "Item B");
		
		System.out.println(itemA);
		System.out.println(itemB.toString());
	}
}
