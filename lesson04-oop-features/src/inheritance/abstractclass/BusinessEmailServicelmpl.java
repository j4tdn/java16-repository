package inheritance.abstractclass;

public class BusinessEmailServicelmpl extends EmailService {

	@Override
	void login() {
		System.out.println("BusinessEmailServicelmpl --> login");
		
	}
	@Override
	void loginWith2Stesp() {
		System.out.println("BusinessEmailServicelmpl --> using OTP");
}
	
}
