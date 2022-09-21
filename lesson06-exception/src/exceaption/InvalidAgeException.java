package exceaption;

// runtime --> extends RuntimeException
// combine --> extends Exception
public class InvalidAgeException extends Exception {
	// Serializable;
	// serialVersionUID --> key to define object to serialize or de-serialize
	private static final long serialVersionUID = -846835668990863445L;

	public InvalidAgeException() {
		super("--> InvalidAgeException");
	}

	public InvalidAgeException(String message) {
		super(message);
	}
}
