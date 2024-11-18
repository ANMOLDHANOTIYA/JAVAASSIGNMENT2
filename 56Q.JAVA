class TooHotException extends Exception {
    public TooHotException(String message) {
        super(message);
    }
}

class TooColdException extends Exception {
    public TooColdException(String message) {
        super(message);
    }
}

public class TemperatureCheck {
    public static void main(String[] args) {
        try {
            double temperature = 40;  // Change this to test different temperatures

            if (temperature > 35) {
                throw new TooHotException("The temperature is too hot! (" + temperature + "°C)");
            } else if (temperature < 5) {
                throw new TooColdException("The temperature is too cold! (" + temperature + "°C)");
            } else {
                System.out.println("Normal temperature: " + temperature + "°C");
                double fahrenheit = (temperature * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit + "°F");
            }

        } catch (TooHotException | TooColdException e) {
            System.out.println(e.getMessage());
        }
    }
}
