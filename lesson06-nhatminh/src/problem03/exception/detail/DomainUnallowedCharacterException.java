package problem03.exception.detail;

import problem03.exception.EmailException;

public class DomainUnallowedCharacterException extends EmailException {

	private static final long serialVersionUID = 1L;

	public DomainUnallowedCharacterException() {
		this("Allowed characters in domain and prefix: letters, numbers, dashes!!!");
	}

	public DomainUnallowedCharacterException(String message) {
		super(message);
	}
}
