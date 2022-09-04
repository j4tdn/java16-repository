package inheritance.abstractclass;

public class BuisinessEmailServiceImpl extends EmailService {

	@Override
	void login() {
		System.out.println("BuisinessEmailServiceImpl --> login");
		
	}


	@Override
	void loginWith2Step() {
		System.out.println("BuisinessEmailServiceImpl --> using OTP");
		
	}
}
