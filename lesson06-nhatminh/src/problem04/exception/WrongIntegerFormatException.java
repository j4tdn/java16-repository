package problem04.exception;

public class WrongIntegerFormatException extends Exception {

	private static final long serialVersionUID = 1L;

	public WrongIntegerFormatException() {
		this("Wrong integer format!!!");
	}

	public WrongIntegerFormatException(String message) {
		super(message);
	}
}
