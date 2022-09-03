package inheritance.abstractclass;

public class BussinessEmailServiceImpl extends EmailService {

	@Override
	void login() {
		System.out.println("BussinessEmailServiceImpl-->login");

	}

	void loginWith2Stesp() {
		System.out.println("BussinessEmailServiceImpl-->using OTP");
	}
}
