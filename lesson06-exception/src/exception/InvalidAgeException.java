package exception;

// runtime --> extends RuntimeException
// compile --> extends Exception
public class InvalidAgeException extends Exception {

	public InvalidAgeException() {
		this("--> InvalidAgeException");
	}

	public InvalidAgeException(String message) {
		super(message);
	}
}
