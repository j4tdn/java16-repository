package view;

import bean.User;
import bean.UserDetail;

// Sử dụng
//1.Class có nhiều hơn 5 tham số
//2.Class yêu cầu hàm tạo ra nhiều hàm khởi tạo khác nhau

public class Ex01BuilderPattternDemo {
	public static void main(String[] args) {
		User user1 =  User.builder()
				.withFirstName("Anh")
				.withLastName("Gian")
				.withAge(21)
				.build();
		System.out.println(user1);
		User user2 =  User.builder()
				.withFirstName("Anh")
				.withLastName("Gian")
				.withAge(21)
				.build();
		System.out.println(user2);
		
		UserDetail uC = new UserDetail()
				.withAge(22)
				.withPhone("0932123456");
		System.out.println(uC);
		
				
	}

}
