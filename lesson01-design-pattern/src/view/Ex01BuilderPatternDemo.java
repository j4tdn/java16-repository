package view;

import bean.User;
import bean.UserDetail;

/*
 * Đặt vấn đề:
 * --> Builder pattern được sử dụng để tạo ra các đối tượng phức tạp
 * --> phức tạp: nhiều thuộc tính
 * 1. dễ xảy ra lỗi khi truyền không đúng thứ tự tham số cho đối tượng
 * 2. khi yêu cầu tạo ra quá nhiều hàm khởi tạo, un-clear code 
 * 
 * sử dụng
 * 1. class có nhiều hơn 5 tham số
 * 2. class yêu cầu tạo ra nhiều hàm khởi tạo khác nhau
 * 
 */

public class Ex01BuilderPatternDemo {

	public static void main(String[] args) {
		User uA = User.builder()
					  .withFirstName("Teo")
					  .withLastName("Le")
					  .withPhone("0345632341").biuld();
		System.out.println(uA);
		
		User uB = User.builder()
				  .withFirstName("Hoang")
				  .withLastName("Nam")
				  .withAge(25).biuld();
		System.out.println(uB);
		
		UserDetail uC = new UserDetail()
							.withAge(22)
							.withPhone("0342938138");
		System.out.println(uC);
	}

}
