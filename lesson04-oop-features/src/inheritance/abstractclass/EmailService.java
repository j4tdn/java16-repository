package inheritance.abstractclass;
/**
 * Abstract class can contain
 * + abstract methods
 * + non-abstract methods
 * @author ADMIN
 *
 */
public abstract class EmailService {
	abstract void login();
	
	void loginWith2Steps() {
		System.out.println("Email service --> loginWith2Steps");
	}
	
	

}
