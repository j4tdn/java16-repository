package problem03.exception.detail;

import problem03.exception.EmailException;

public class DividedCharacterException extends EmailException {

	private static final long serialVersionUID = 1L;

	public DividedCharacterException() {
		this("An underscore, period, or dash must be followed by one or more letter or number!!!");
	}

	public DividedCharacterException(String message) {
		super(message);
	}
}
