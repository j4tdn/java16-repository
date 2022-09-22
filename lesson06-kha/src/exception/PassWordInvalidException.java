package exception;

public class PassWordInvalidException extends IllegalArgumentException {
	public PassWordInvalidException(String message) {
		super(message);
	}
}
