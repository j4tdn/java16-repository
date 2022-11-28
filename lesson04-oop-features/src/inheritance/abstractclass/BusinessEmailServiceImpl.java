package inheritance.abstractclass;

public class BusinessEmailServiceImpl extends EmailService{
	@Override
	void login() {
		System.out.println("BusinessEmailServceImpl --> login");
	}
	
	@Override
	void loginWith2Steps() {
		System.out.println("BusinessEmailServceImpl --> using OTP");
	}
}
