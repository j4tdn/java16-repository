package inheritance.abstractclass;

public class BusinessEmailServiceImpl extends EmailService {

	@Override
	void login() {
		System.out.println("BusinessEmailServiceImpl --> login");
	}
	@Override
	void loginWithHighSteps() {
		System.out.println("BusinessEmailServiceImpl --> using OTP");
	}
}
