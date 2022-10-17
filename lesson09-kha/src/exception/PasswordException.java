package exception;

public class PasswordException extends RuntimeException {
	public PasswordException(String mess){
		super(mess);
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
}
