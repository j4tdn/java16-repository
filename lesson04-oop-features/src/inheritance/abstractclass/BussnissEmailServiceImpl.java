package inheritance.abstractclass;

public class BussnissEmailServiceImpl extends EmailService{

	@Override
	void login() {
		System.out.println("BuinessEmailServiceImpl --> login");
		
	}
	@Override
	void loginWith2Stesp() {
		System.out.println("BuinessEmailServiceImpl --> using OTP");
		
	}
}
