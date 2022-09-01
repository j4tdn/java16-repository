package inheritance.abstratclass;
/*
 * Abstract class an contain
 * abstract methods & non abstract methods
 */

public abstract class EmailService {
	abstract void login();
	void loginWith2Step() {
		System.out.println("EmailService --> loginWith2Steps");
	}

}
