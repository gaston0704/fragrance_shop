package exceptionspack;

public class AuthorizationError extends Exception{
    public AuthorizationError(String message) {
        super(message);
    }
}
