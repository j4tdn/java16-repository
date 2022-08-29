package inheritance.abstractclass;
/*
 * Abstract class can contain
 * + Abstract methods
 * + non-abstract methods
 */
public abstract class EmailService {
	abstract void login();
	
	void loginWith2Steps() {
		System.out.println("EmailService --> loginWith2Steps");
	}
}