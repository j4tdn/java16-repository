package inheritance.abstractclass;
/**
 * Abstract class can contain
 * + abstract methods
 * non-abstract methods
 * 
 * @author Asus
 *
 */
public abstract class EmailService {
	abstract void login();
	
	void loginWith2Stesp() {
		System.out.println("EmailService --> loginWith2");
	}
	
}
