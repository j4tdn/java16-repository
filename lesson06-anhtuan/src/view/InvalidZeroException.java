package view;

public class InvalidZeroException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public InvalidZeroException() {
		super("--> InvalidAgeException");
	}
	
	public InvalidZeroException(String message) {
		super(message);
	}
	

}
