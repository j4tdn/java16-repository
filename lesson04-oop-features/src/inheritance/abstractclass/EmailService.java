package inheritance.abstractclass;

/**
 *  Abstract class can contain
 *  + abstract class
 *  + non-abstract class
 */
public abstract class EmailService {
	abstract void login();
	
	void loginWith2Steps() {
		System.out.println("EmailService --> loginWith2Steps");
	}
}
