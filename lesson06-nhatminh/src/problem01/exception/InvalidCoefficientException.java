package problem01.exception;

public class InvalidCoefficientException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidCoefficientException() {
		this("Coefficient \"a\" cannot equal to 0!!!");
	}

	public InvalidCoefficientException(String message) {
		super(message);
	}
}
