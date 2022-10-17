package problem04.exception;

public class InvalidPasswordLength extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidPasswordLength() {
		this("Password minimum length is 8!!!");
	}

	public InvalidPasswordLength(String message) {
		super(message);
	}
}
