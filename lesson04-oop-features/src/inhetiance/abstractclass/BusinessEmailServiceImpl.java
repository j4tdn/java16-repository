package inhetiance.abstractclass;

public class BusinessEmailServiceImpl extends EmailService {

	@Override
	void login() {
		System.out.println("BusinessEmailServiceImpl--> login");
	}
	
	@Override
	void loginWith2Step() {
		System.out.println("BusinessEmailServiceImpl--> using OTP");
	}

}
