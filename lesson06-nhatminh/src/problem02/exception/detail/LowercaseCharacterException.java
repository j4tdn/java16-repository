package problem02.exception.detail;

import problem02.exception.InvalidPasswordException;

public class LowercaseCharacterException extends InvalidPasswordException {

	private static final long serialVersionUID = 1L;

	public LowercaseCharacterException() {
		this("At least 1 lowercase alphabetic character!!!");
	}

	public LowercaseCharacterException(String message) {
		super(message);
	}
}
