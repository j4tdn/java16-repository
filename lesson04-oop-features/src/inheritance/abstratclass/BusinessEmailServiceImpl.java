package inheritance.abstratclass;

public class BusinessEmailServiceImpl extends EmailService {
	@Override
	void login() {
		// TODO Auto-generated method stub
		System.out.println("BusinessEmailServiceImpl --> login");
	}
	@Override
	void loginWith2Step() {
		// TODO Auto-generated method stub
		System.out.println("BusinessEmailService --> OTP");
	}

}
