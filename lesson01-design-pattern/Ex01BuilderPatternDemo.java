package view;

import bean.User;
import bean.Userdetail;
/**
 * 
 * 1. khi class co nhieu` hon 5 tham so'
 * 2. khi class yeu cau` tao ra nhieu` ham` khoi tao khac' nhau
 *
 */
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
