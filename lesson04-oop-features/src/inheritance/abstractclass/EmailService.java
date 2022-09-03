package inheritance.abstractclass;


/**
 * Abstract class can contain
 * abstract methods
 * non-abstact methods
 * @author chien
 *
 */
public abstract class EmailService {
	abstract void login();
	
	void loginWith2Steps() {
		System.out.println("EmailService --> loginWith2Steps");
	}
	
}
