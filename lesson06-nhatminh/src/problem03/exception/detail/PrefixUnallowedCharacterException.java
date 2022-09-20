package problem03.exception.detail;

import problem03.exception.EmailException;

public class PrefixUnallowedCharacterException extends EmailException {

	private static final long serialVersionUID = 1L;

	public PrefixUnallowedCharacterException() {
		this("Allowed characters in domain and prefix: letters, numbers, dashes!!!");
	}

	public PrefixUnallowedCharacterException(String message) {
		super(message);
	}
}
