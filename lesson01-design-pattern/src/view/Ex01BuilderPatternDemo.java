package view;

import bean.User;
import bean.UserDetail;

/*
 * Dat van de 
 * --> Builder pattern duoc su dung de tao ra cac doi tuong phuc tap
 * --> Phuc tap: Nhieu thuoc tinh
 * 1. De xay ra loi khi truyen khong dung thu tu tham so cho doi tuong
 * 2. Khi yeu cau tao ra qua nhieu ham khoi tao, un-clean code
 */
public class Ex01BuilderPatternDemo {
	public static void main(String[] args) {
		User uA = User.builder().withLastName("Le").withFirstName("Teo").withPhone("034568936").build();
		System.out.println(uA);
		User uB = User.builder().withLastName("Hoang").withFirstName("Nam").withAge(25).build();
		System.out.println(uB);

		UserDetail uC = new UserDetail().withAge(22).withPhone("123456789");
		System.out.println(uC);
	}
}
