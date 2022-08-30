package inheritance.abstractclass;

public class BusinessEmailServiceIpml extends EmailService {

	@Override
	void login() {
		System.out.println("BusinessEmailServiceIpml --> login");
		
	}
	
	@Override
	void loginWith2Steps() {
		System.out.println("BusinessEmailServiceIpml --> using OTP");
	}

}
