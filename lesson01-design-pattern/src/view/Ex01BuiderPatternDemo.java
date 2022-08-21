package view;

import java.nio.file.attribute.UserDefinedFileAttributeView;

import bean.User;
import bean.UserDetail;
import bean.UserDraft;

public class Ex01BuiderPatternDemo {

	// Buider pattern dung de tao ra cac doi tuong phuc tap ( nhieu thuoc tinh )
	// 1. De xay ra loi khi truyen khong dung tham so cho doi tuong
	// 2. Khi yeu cau tao ra qua nhieu ham khoi tao, un-clean code

	// Su dung
	// 1. Class co nhieu hon 5 tham so
	// 2. Class yeu cau ham khoi tao ra nhieu ham khoi tao khac nhau
	public static void main(String[] args) {
		
		User uA = User.builder()
					.withFirstName("Teo")
					.withLastName("Le")
					.withPhone("34234")
					.build();
		
		System.out.println(uA);
		
		User uB = User.builder()
				.withFirstName("Le")
				.withLastName("Teo")
				.withAge(15)
				.build();
				
		System.out.println(uB);
				
		UserDetail uC = new UserDetail()
				.withAge(22)
				.withPhone("23423");
		System.out.println(uC);
		
	}

}
