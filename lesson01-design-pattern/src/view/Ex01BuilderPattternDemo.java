package view;

import bean.User;
import bean.UserDetail;

// Sá»­ dá»¥ng
//1.Class cĂ³ nhiá»�u hÆ¡n 5 tham sá»‘
//2.Class yĂªu cáº§u hĂ m táº¡o ra nhiá»�u hĂ m khá»Ÿi táº¡o khĂ¡c nhau

public class Ex01BuilderPattternDemo {
	public static void main(String[] args) {
		User user1 =  User.builder()
				.withFirstName("Anh")
				.withLastName("Gian")
				.withAge(21)
				.build();
		System.out.println(user1);
		User user3 = User.builder().withFirstName("Anh").withLastName("Duy").withAge(21).build();
		System.out.println(user3);
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
