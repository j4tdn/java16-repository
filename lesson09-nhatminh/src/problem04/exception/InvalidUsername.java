package problem04.exception;

public class InvalidUsername extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidUsername() {
		this("Username contains a-z, A-Z and numbers only!!!");
	}

	public InvalidUsername(String message) {
		super(message);
	}
}
