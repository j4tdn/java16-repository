package inheritance.abstractclass;

/*
 * Abstract class can cotain
 * +abstract methods
 * +non-abstract methods
*/

public abstract class EmailService {
	abstract void login();
	
	void loginWith2Steps() {
		System.out.println("EmailService --> loginWith2Steps");
	}
	
	
}
