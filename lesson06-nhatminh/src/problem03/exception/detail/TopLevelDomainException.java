package problem03.exception.detail;

import problem03.exception.EmailException;

public class TopLevelDomainException extends EmailException {

	private static final long serialVersionUID = 1L;

	public TopLevelDomainException() {
		this("Domain must have top-level domain!!!");
	}

	public TopLevelDomainException(String message) {
		super(message);
	}
}
