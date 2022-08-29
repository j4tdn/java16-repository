package inheritance.abstractclass;

public class BusinessEmailServiceImpl extends EmailService {
	
	@Override
	void login() {
		// TODO Auto-generated method stub
		System.out.println("BusinessEmailServiceImpl --> login : Success");
		
	}
	
	@Override
	void loginWith2Steps() {
		System.out.println("BusinessEmailServiceImpl --> using OTP : Success");
	}

}
