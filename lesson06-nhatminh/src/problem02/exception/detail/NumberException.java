package problem02.exception.detail;

import problem02.exception.InvalidPasswordException;

public class NumberException extends InvalidPasswordException {
	private static final long serialVersionUID = 1L;

	public NumberException() {
		this("At least 1 number!!!");
	}

	public NumberException(String message) {
		super(message);
	}
}
