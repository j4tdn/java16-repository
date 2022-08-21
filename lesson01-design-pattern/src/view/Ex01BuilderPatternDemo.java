package view;

import bean.User;
import bean.UserDetail;

/**
 * 
 * Đặt vấn đề: --> Builder pattern sử dụng để tạo cho các đối tượng phức tạp
 * (nhiều thuộc tính) 1. Dễ xảy ra lỗi khi truyền không đúng thứ tự 2. Khi yêu
 * cầu tạo ra quá nhiều hàm khởi tạo - unclean-code
 *
 * Sử dụng:
 * 1. Class có nhiều hơn 5 tham số
 * 2. Class yêu cầu hàm tạo ra nhiều hàm khởi tạo khác nhau
 *
 */
public class Ex01BuilderPatternDemo {
	public static void main(String[] args) {
		User uA = User.builder().withFirstName("Teo").withLastName("Le").withPhone("03456789").build();
		System.out.println(uA);

		User uB = User.builder().withFirstName("Hoang").withLastName("Nam").withPhone("09945789").build();
		System.out.println(uA);
		
		UserDetail uC = new UserDetail().withAge(24).withPhone("024548455");
		System.out.println(uC);
	}
	

}
