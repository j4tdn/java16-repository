package Inheritance_abstractclass;

public class BusinessEmailServiceImpl extends EmailService {
	
	@Override
	void login() {
		System.out.println("BusinessEmailServiceImpl --> login");
	}
	
	@Override
	void loginWith2Steps() {
		System.out.println("BusinessEmailServiceImpl --> using OTP");
	}
}
