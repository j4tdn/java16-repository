package view;

import bean.User;

public class Ex01BuilderPatternDemo {

	public static void main(String[] args) {
		User uA = User.builder()
				.withFirstName("Teo")
				.withLastName("Le")
				.withPhone("22222").build();
		System.out.println(uA);
	}
}
