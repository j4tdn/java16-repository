package problem02.exception.detail;

import problem02.exception.InvalidPasswordException;

public class SpecialCharacterException extends InvalidPasswordException {
	private static final long serialVersionUID = 1L;

	public SpecialCharacterException() {
		this("At least 1 special character!!!");
	}

	public SpecialCharacterException(String message) {
		super(message);
	}
}
