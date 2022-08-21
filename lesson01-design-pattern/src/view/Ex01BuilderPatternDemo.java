package view;

import bean.User;
import bean.Userdetail;

public class Ex01BuilderPatternDemo {
	public static void main(String[] args) {
	
		User u1 =  User.builder().withFirstname("kha")
									.withLastname("pham")
									.withAge(22)
									.withPhone("093123124")
									.withAddress("null")
									.buildUser();
		System.out.println(u1.toString());
		
		Userdetail u2 = new Userdetail().withFirstname("kha")
									.withLastname("pham")
									.withAge(22)
									.withPhone("093123124")
									.withAddress("null");
	}
}
