package view;

import bean.UserDraft;

/**
 * Đặt vấn đề
 * --> Builder pattern được sử dụng để tạo ra các đối tượng phức tạp
 * --> Phức tạp: Nhiều Thuộc tính
 * 1. Dễ xảy ra lỗi khi truyền không đúng thứ tự tham số cho đối tượng
 * 2. Khi các yêu cầu tạo ra quá nhiều hàm khởi tạo , un-clean code
 * @author chien
 *
 */
public class Ex01BuilderPatternDemo {
	public static void main(String[] args) {
		UserDraft userA = new UserDraft("Teo" , "Le" , 15 ,"012345678" ,"Da Nang");
		UserDraft userB = new UserDraft("Le" , "Teo" , 15 ,"DA Nang" ,"012345678");
	}
}
