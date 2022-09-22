package exception;

public class InvalidAgeException extends Exception{
	private static final long serialVersionUID = 6368183477036711158L;

	public InvalidAgeException() {
		super("--> InvalidAgeException");
	}
	
	public InvalidAgeException(String message) {
		super(message);
	}
}
