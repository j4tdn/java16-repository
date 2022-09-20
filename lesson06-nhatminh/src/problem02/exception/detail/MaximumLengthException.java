package problem02.exception.detail;

import problem02.exception.InvalidPasswordException;

public class MaximumLengthException extends InvalidPasswordException {

	private static final long serialVersionUID = 1L;

	public MaximumLengthException() {
		this("At most 256 characters!!!");
	}

	public MaximumLengthException(String message) {
		super(message);
	}
}
