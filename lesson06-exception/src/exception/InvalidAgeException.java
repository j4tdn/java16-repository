package exception;

//runtime --> extends runtime Exception
//compile --> extends Exception

public class InvalidAgeException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAgeException() {
		super("--> InvalidAgeException");
	}
	
	public InvalidAgeException(String message) {
		super(message);
	}

}
