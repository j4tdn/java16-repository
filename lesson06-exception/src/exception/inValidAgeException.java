package exception;

public class inValidAgeException extends Exception {
	private static final long serialVersionUID = -3528829751977419518L;

	//	public inValidAgeException(String message) {
	//		super(message);
	//	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Tuoi L*z ma` vote";
	}
}
