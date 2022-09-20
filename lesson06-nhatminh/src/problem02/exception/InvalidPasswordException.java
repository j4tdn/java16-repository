package problem02.exception;

public class InvalidPasswordException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidPasswordException() {
		this("Invalid password!!!");
	}

	public InvalidPasswordException(String message) {
		super(message);
	}
}
