package inheritance.abstractclass;
/*
 * Abstract class can contain(có thể chứa)
 * +abstract method
 * +non-abstract method(hàm có body)
 */

public abstract class EmailService {
	abstract void login();//abstract method
	
	void loginWith2Step() {
		System.out.println("EmailService --> loginWith2Step");
	}

}
