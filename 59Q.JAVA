class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}

public class NegativeAgeCheck {
    public static void main(String[] args) {
        int age = -5;  // Change this to test

        try {
            if (age < 0) {
                throw new NegativeAgeException("Age cannot be negative.");
            }
            System.out.println("Age is: " + age);
        } catch (NegativeAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
