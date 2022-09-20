package problem02.exception.detail;

import problem02.exception.InvalidPasswordException;

public class MinimumLengthException extends InvalidPasswordException {

	private static final long serialVersionUID = 1L;

	public MinimumLengthException() {
		this("At least 8 characters!!!");
	}

	public MinimumLengthException(String message) {
		super(message);
	}
}
