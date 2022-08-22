package view;

import bean.User;
import bean.UserDetail;

/*
 * Đặt vấn đề 
 * -->Builder pattern được sử dụng để tạo ra đối tượng phức tạp.
 * -->Phức tạp: nhiều thuộc tính.
 * 1. Dễ xảy ra lỗi khi truyền không đúng thứ tự tham số cho đối tượng
 * 2. Khi yêu cầu tạo ra  quá nhiều hàm khởi tạo, un-clean code.
 * 
 * Sử dụng 
 * 1. Class có nhiều hơn 5 tham số
 * 2. Class yêu cầu hàm tạo ra nhiều hàm khởi tạo khác nhau.
 * 
 */
public class Ex01BuilderPatternDemo {
	public static void main(String[] args) {
		User uA = User.builder().withLastName("teo").withLastName("le")

				.withPhone("0384396351").build();
		System.out.println(uA);

		User uB = User.builder().withLastName("hoang").withLastName("doan").withPhone("0384396351").build();
		System.out.println(uB);

		UserDetail uC = new UserDetail().withAge(22).withPhone("0123456689");
		System.out.println(uC);

	}
}
