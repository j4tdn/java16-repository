package exception;

// if our exception is kind of Runtime => extends RuntimeException
// if our exception is kind of Compile => extends Exception
public class InvalidAgeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6368183477036711158L;

	public InvalidAgeException() {
//		super("--> InvalidAgeException");
		this("--> InvalidAgeException");
		// this line will call the construction function 1 parameter below
	}
	
	public InvalidAgeException(String message) {
		super(message);
	}
}
