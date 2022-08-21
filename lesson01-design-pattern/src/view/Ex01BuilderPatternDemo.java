package view;

import bean.User;
import bean.UserDraft;
import bean.UserDetail;

/*
 * --> builder pattern đc sd để tạo các object phức tạp
 * --> phức 
 */

public class Ex01BuilderPatternDemo {
	public static void main(String[] args) {
		User uA =User.builder()
		    .withLastName("Le")
		    .withFirstName("Teo")
		    .withPhone("01234").build();
		}
		
	UserDetail uC = new UserDetail()
			.withAddress(22)
			.withPhone("12345");
	System.out.println(uC);

}
