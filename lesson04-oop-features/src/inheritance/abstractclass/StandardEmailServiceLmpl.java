package inheritance.abstractclass;

public class StandardEmailServiceLmpl extends EmailService {
	
	@Override
	void login() {
		System.out.println("StandardEmailServiceLmpl -> login");
		
	}
}
