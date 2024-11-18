class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class LoginValidation {
    public static void main(String[] args) {
        String username = "john";  // Change this to test
        String password = "pass123";  // Change this to test
        String correctPassword = "pass123";

        try {
            if (username.length() < 6) {
                throw new InvalidUsernameException("Username must be at least 6 characters long.");
            }
            if (!password.equals(correctPassword)) {
                throw new InvalidPasswordException("Incorrect password.");
            }
            System.out.println("Login successful!");
        } catch (InvalidUsernameException | InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
