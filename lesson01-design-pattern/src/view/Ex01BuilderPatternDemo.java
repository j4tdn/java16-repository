package view;

import bean.User;
import bean.UserDetail;
import bean.UserDraft;
/**
* Sử dụng
*1. Class có nhiều hơn 5 tham số
* Clas yêu cầu hàm tạo ra nhiều hàm khởi tạo
*/
public class Ex01BuilderPatternDemo {
	public static void main(String[] args) {
		User uA = User.builder()
			.withFirstName("Teo")
			.withLastName("Le")
			.withPhone("03218475123")
			.build();
		System.out.println(uA);	
		
		User uB = User.builder()
				.withFirstName("Teo")
				.withLastName("Le")
				.withPhone("03218475123")
				.build();
			System.out.println(uB);	
			
			UserDetail uC = new UserDetail()
					.withAge(22)
					.withPhone("123456789");
			System.out.println(uC);
	}
}
