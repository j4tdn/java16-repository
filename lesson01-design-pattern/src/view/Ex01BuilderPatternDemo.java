package view;

import bean.User;
import bean.UserDetail;

public class Ex01BuilderPatternDemo {
	/*
	 * Đặt vấn đề
	 * --> Builder pattern được sử dụng để tạo ra các đối tượng phức tạp
	 * --> Phức tạp: nhiều thuộc tính
	 *  manatory: firstName, lastName, the rest is optional
	 * 1. Dễ xảy ra lỗi khi truyền không đúng thứ tự tham số cho đối tượng
	 * 2. Khi yêu cầu tạo ra quá nhiều hàm khởi tạo, un-clean code
	 * 
	 * Sử dụng:
	 * 1 - Class có nhiều hơn 5 tham số
	 * 2 - Class yêu cầu hàm khởi tạo tạo ra nhiều hàm khởi tạo khác nhau
	 * */
	public static void main(String[] args) {
		User uA  = User.builder()
			.withLastName("Le")
			.withFirstName("Teo")
			.withtPhone("012345678")
			.build();
		
		System.out.println(uA);
		
		User uB  = User.builder()
				.withLastName("Hoang")
				.withFirstName("Nam")
				.build();
			
			System.out.println(uB);
			
		UserDetail uC = new UserDetail()
						.withAge(22)
						.withPhone("113");
		
		System.out.println(uC);
						
	}
}