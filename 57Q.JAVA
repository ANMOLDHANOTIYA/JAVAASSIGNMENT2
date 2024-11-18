class TooOlderException extends Exception {
    public TooOlderException(String message) {
        super(message);
    }
}

class TooYoungerException extends Exception {
    public TooYoungerException(String message) {
        super(message);
    }
}

public class EmployeeAgeEligibility {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 30;  // Change this to test different ages

        try {
            if (age > 45) {
                throw new TooOlderException("Candidate is too old to apply.");
            } else if (age < 20) {
                throw new TooYoungerException("Candidate is too young to apply.");
            } else {
                System.out.println(name + " is eligible to apply.");
            }
        } catch (TooOlderException | TooYoungerException e) {
            System.out.println(e.getMessage());
        }
    }
}
