package inheritance.abstractclass;
// hàm trừu tượng

/*
 * Abstract class can contain 
 * + abstract methods 
 * + non- abstract methods
 */
public abstract class EmailService {
	abstract void login();
	
	void loginWith2Stesp() {
		System.out.println("EmailService -- > loginwith2Steps");
	}
	
	
}
