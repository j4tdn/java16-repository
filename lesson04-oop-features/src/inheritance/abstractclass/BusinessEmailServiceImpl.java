package inheritance.abstractclass;

public class BusinessEmailServiceImpl extends EmailService{
	@Override
	void login() {
		System.out.println("BusinessEmailService --> login");
	}
	
	@Override
	void loginWith2Steps() {
		System.out.println("BusinessEmailService --> using OTP");
	}
}
