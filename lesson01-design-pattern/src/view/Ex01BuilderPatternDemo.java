package view;

import bean.User;
import bean.UserDetail;
import bean.UserDraft;

public class Ex01BuilderPatternDemo {

	/**
	 * Đặt vấn đề -->Builder patterm được sử dụng để tạo ra các đối tượng phức tạp
	 * -->phức tạp: Nhiều thuộc tính 
	 * 1.Dễ xảy ra lỗi khi truyền không đúng thứ tự tham số cho đối tượng
	 * 2. khi yêu cầu tạo ra quá nhiều hàm khởi tạo,un-clean code
	 * 
	 * sử dụng
	 * 1. Class có nhiều hơn 5 tham số
	 * 2. Class yêu cầu hàm tạo ra nhiều hàm khởi tạo khác nhau 	
	 */

	public static void main(String[] args) {
		User uA = User.builder()
				.withFirstName("Teo")
				.withLastName("Le")
				.withPhone("03333333333").builder();
		System.out.println(uA);
		User uB = User.builder()
				.withLastName("Le")
				.withFirstName("Hoang")
				.withAge(25)
				.builder();
		System.out.println(uB);
		
		UserDetail uC = new UserDetail()
						.withAge(22)
						.withPhone("123456789");
		System.out.println(uC);
	}

}