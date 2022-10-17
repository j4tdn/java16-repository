package problem04.exception;

public class PasswordNotMatchException extends Exception {
	private static final long serialVersionUID = 1L;

	public PasswordNotMatchException() {
		this("Password does not match!!!");
	}

	public PasswordNotMatchException(String message) {
		super(message);
	}
}
