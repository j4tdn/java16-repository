package inheritance.abstractclass;

/**
 * 
 * Abstract class can contain
 * + abtract methods
 * + non abstract methods
 *
 */
public  abstract class EmailService {
	
	abstract void login();
	
	void loginWith2Steps() {
		System.out.println("EmailService --> LoginWith2Steps");
	}

}
