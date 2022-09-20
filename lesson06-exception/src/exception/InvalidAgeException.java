package exception;

public class InvalidAgeException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2556927661132235032L;
	public InvalidAgeException() {
		super("InvalidAgeException");
	}
	public InvalidAgeException(String message) {
		super(message);
	}
	public String getMessage() {
		return "chua du tuoi? cut ve";
	}
	

}
