package inhetiance.abstractclass;

public abstract class EmailService {
	
	/*
	 * Abstract class can contain:
	 * - abstract methods
	 * - non-abstract methods
	 */
	
	abstract void login();
	
	
	void loginWith2Step() {
		System.out.println("EmailService--> loginWith2Step");
	}
	

}
