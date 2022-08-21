package view;

import bean.User;
import bean.UserDetail;

/*
 * Đặt vấn đề
--> Builder pattern được sử dụng để tạo ra các đối tượng phức tạp
--> Phức tạp: nhiều thuộc tính
1. Dễ xảy ra lỗi khi truyền không đúng thứ tự tham số cho đối tượng
2. Khi yêu cầu tạo ra quá nhiều hàm khởi tạo, un-clear code

- Sử dụng 
1. Class có nhiều hơn 5 tham số
2. Class yêu cầu hàm tạo ra nhiều hàm khởi tạo khác nhau
 */

public class Ex01BuilderPatternDemo {
	public static void main(String[] args) {
		User uA = User.builder().withFirstName("Le").withLastName("Teo").withPhone("0905060705").build();
		System.out.println(uA);

		User uB = User.builder().withFirstName("Nguyen").withLastName("Nam").withAge(21).build();
		System.out.println(uB);

		UserDetail uC = new UserDetail().withAge(22).withPhone("123456789");
		System.out.println(uC);

	}

}
