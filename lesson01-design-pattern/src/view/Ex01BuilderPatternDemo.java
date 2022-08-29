package view;

import bean.User;
import bean.UserDetail;
import bean.UserDraft;

/**
 * Đặt vấn đề
 * --> Builder pattern được sử dụng để tạo ra các đối tượng phức tạp
 * --> Phức tạp: Nhiều Thuộc tính
 * 1. Dễ xảy ra lỗi khi truyền không đúng thứ tự tham số cho đối tượng
 * 2. Khi các yêu cầu tạo ra quá nhiều hàm khởi tạo , un-clean code
 * 
 *  Su dung
 * 1 Class co nhieu hon 5 tham so
 * 2.Class yeu cau ham tao ra nhieu ham khoi tao khac nhay
 * @author chien
 *
 */
public class Ex01BuilderPatternDemo {
	public static void main(String[] args) {
		User uA = User.builder()
				.withFirstName("Teo")
				.withLastName("Le")
				.withAge(22)
				.withPhone("023456")
				.build();
		System.out.println(uA);
		
		UserDetail uC = new UserDetail()
				.withAge(22)
				.withPhone("123456789");
		System.out.println(uC);
	}
}