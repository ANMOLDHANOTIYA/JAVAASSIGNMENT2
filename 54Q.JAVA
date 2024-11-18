import java.util.Scanner;

class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class CapitalOfCountry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter country name: ");
        String country = sc.nextLine();

        try {
            String capital;
            switch (country.toLowerCase()) {
                case "usa":
                    capital = "Washington, D.C.";
                    break;
                case "india":
                    capital = "New Delhi";
                    break;
                case "uk":
                    capital = "London";
                    break;
                default:
                    throw new NoMatchFoundException("No capital found for " + country);
            }
            System.out.println("Capital of " + country + " is " + capital);
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
