package exception;

public class EmailException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8431857484119316104L;

	public EmailException() {
		super("Invalid Email Exception!!!");
	}
	
	public EmailException(String message) {
		super(message);
	}
}
