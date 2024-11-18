class InvalidArithmeticException extends Exception {
    public InvalidArithmeticException(String message) {
        super(message);
    }
}

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int num = 10;
            int denom = 0;
            if (denom == 0) {
                throw new InvalidArithmeticException("Cannot divide by zero");
            }
            System.out.println("Result: " + num / denom);
        } catch (InvalidArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        try {
            int number = -5;
            if (number < 0) {
                throw new InvalidArithmeticException("Negative number encountered");
            }
            System.out.println("Number: " + number);
        } catch (InvalidArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
