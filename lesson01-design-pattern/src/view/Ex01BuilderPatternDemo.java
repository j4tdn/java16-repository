package view;

import bean.User;
import bean.UserDetail;

/**
 * Dat van de:
 * --> Builder parrtern duocj su dung de tao ra cacs doi tuong phuc tap
 * --> Phuc tap: Nhieu thuoc tinh
 * 1.Dễ xảy ra lỗi  khi truyền không đúng thứ tự tham số cho đối tượng
 * 2.Khi yêu cầu tạo ra quá nhiều hàm khởi tạo, un-clean code
 * 
 * @author Admin
 *
 */
public class Ex01BuilderPatternDemo {
	public static void main(String[] args) {
		User uA = User.builder()
		.withFirstName("linh")
		.withLast("huynh")
		.withAge(20).build();
		
		System.out.println(uA);
		System.out.println("===================");
		UserDetail uC = new UserDetail()
				.withAge(22)
				.withPhone("23423");
		System.out.println(uC);
	}
}
