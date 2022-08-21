package view;

import bean.User;
import bean.UserDetail;
import bean.UserDraft;

/*
 * Đặt vấn đề:
 * --> Builder pattern được sử dụng để tạo ra các đối tượng phức tạp
 * --> Phức tạp: Nhiều thuộc tính
 * 1. Dễ xảy ra lỗi khi truyền không đúng thứ tự tham số cho đối tượng
 * 2. Khi yêu cầu tạo ra quá nhiều hàm khởi tạo, un-clear code
 * 
 * Sử dụng:
 * 1. Class có nhiều hơn 5 tham số
 * 2. Class yêu cầu hàm tọa ra nhiều hàm khởi tạo khác nhau
 */

public class Ex01BuilderPatternDemo {
	public static void main(String[] args) {
		
		UserDetail uC = new UserDetail()
				.withAge(23)
				.withPhone("087612736");
		System.out.println(uC);
	}
}
