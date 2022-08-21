package view;

import bin.User;
import bin.UserDetail;

/**
 * Đặt vấn đề
 * -->Builder pattern được sử dụng để tạo các đối tượng phức tạp
 * --> phực tạp là nhiều thuộc tính
 * 1-dễ xảy ra lỗi khi truyền không đúng thứ tự tham số đối tượng
 * 2-khi yêu cầu tạo ra quá nhiều hàm khởi tạo, un-clean code
 * 
 * Sử dụng
 * 1. class có nhiều hơn 5 tham số
 * 2. class yêu cầu tạo ra nhiều hàm khởi tạo khác nhau
 * @author DucTrung
 *
 */

public class Ex01BuilderPattenDemo {
	public static void main(String[] args) {
		User uA = User.Builder()
		    .withFirstName("Teo");
		    .build();
		    
		UserDetail uC= new UserDetail();
		    .withAge(22);
		    .withPhone("123445");
		    System.out.println(uC);
	}

}
