package problem04.exception;

public class Repeat3TimeWithUsernameException extends Exception {
	private static final long serialVersionUID = 1L;

	public Repeat3TimeWithUsernameException() {
		this("Password must not match 3 characters with username!!!");
	}

	public Repeat3TimeWithUsernameException(String message) {
		super(message);
	}
}
