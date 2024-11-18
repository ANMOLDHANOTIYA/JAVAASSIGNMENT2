public class ExceptionHandlingKeywords {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Arithmetic exception
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        try {
            String str = null;
            str.length(); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Another finally block executed.");
        }
    }
}
