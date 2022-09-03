package inheritance.abstractclass;
/*
 * abstract class can contain
 * + abstract methods 
 * + non -abstract method 
 */

public abstract class EmailService {
	abstract void login();

	void loginWith2Stesp() {
		System.out.println("Email service-->loginwith2stesp");
	}
}
