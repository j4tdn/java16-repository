package problem03.exception;

public class EmailException extends Exception {

	private static final long serialVersionUID = 1L;

	public EmailException() {
		this("Invalid email!!!");
	}

	public EmailException(String message) {
		super(message);
	}
}
