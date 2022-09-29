package view;

import bean.User;
import bean.UserDetail;

/**
 * Đặt vấn đề --> Builder pattern được sử dụng để tạo ra các đối tượng phức tạp
 * --> Phức tạp: Nhiều thuộc tính 1. Dễ xảy ra lỗi khi truyền không đúng thứ tự
 * tham số cho đối tượng 2. Khi yêu cầu tạo ra quá nhiều hàm khởi toạ, un-clean
 * code
 * 
 * Sử dụng 
 * 1. Class có nhiều hơn 5 tham số 
 * 2. Class yêu cầu hàm tạo ra nhiều hàm khởi tạo khác nhau
 * khỏi tạo khác nhau
 * 
 * @author OS
 *
 */
public class Ex01BuilderPatternDeomo {
	public static void main(String[] args) {
		User uA = User.builder().withFirstName("Teo").withLastName("Le").withPhone("034568936").build();
		System.out.println(uA);
		
		User uB = User.builder().withFirstName("Hoang").withLastName("Nam").withAge(25).build();
		System.out.println(uB);
		
		UserDetail uC = new UserDetail().withAge(22).withPhone("123456789");
		System.out.println(uC);
	}
}
