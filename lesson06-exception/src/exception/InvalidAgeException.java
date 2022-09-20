package exception;

//runtime --> extends RuntimeException
//compile --> extends Exception

public class InvalidAgeException extends Exception {
	
//	private static final long 
	
	public InvalidAgeException() {
		super("--> InvalidAgeException");
	}
	
	public InvalidAgeException(String message) {
		super(message);
	}
}
