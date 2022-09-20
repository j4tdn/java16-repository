package problem03.exception.detail;

import problem03.exception.EmailException;

public class EmailFormatException extends EmailException {

	private static final long serialVersionUID = 1L;

	public EmailFormatException() {
		this("Invalid email format!!!");
	}

	public EmailFormatException(String message) {
		super(message);
	}
}
