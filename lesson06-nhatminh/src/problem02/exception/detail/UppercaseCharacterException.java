package problem02.exception.detail;

import problem02.exception.InvalidPasswordException;

public class UppercaseCharacterException extends InvalidPasswordException {
	private static final long serialVersionUID = 1L;

	public UppercaseCharacterException() {
		this("At least 1 uppercase alphabetic character!!!");
	}

	public UppercaseCharacterException(String message) {
		super(message);
	}
}
