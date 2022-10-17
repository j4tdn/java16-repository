package problem04.exception;

public class InvalidPasswordRequiredCharacter extends Exception {
    private static final long serialVersionUID = 1L;

    public InvalidPasswordRequiredCharacter() {
        this("Password must contain at least 1 special character, 1 uppercase character and 1 number!!!");
    }

    public InvalidPasswordRequiredCharacter(String message) {
        super(message);
    }
}
