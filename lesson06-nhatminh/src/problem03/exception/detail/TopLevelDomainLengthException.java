package problem03.exception.detail;

import problem03.exception.EmailException;

public class TopLevelDomainLengthException extends EmailException {

	private static final long serialVersionUID = 1L;

	public TopLevelDomainLengthException() {
		this("The last portion of the domain must be at least two characters, for example: .com, .org, .cc!!!");
	}

	public TopLevelDomainLengthException(String message) {
		super(message);
	}
}
