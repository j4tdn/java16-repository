package inheritance.abstractclass;

public class BusinessEmailServiceImpl	extends EmailService {
	@Override
	void login() {
		System.out.println("BusinessEmailServiceImpl --> EmailService");
		
	}
	@Override
	void loginWith2Stesp() {
		System.out.println("loginWith2Stesp --> Using OTP");
		
	}

}
