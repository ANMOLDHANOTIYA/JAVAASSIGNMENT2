class Vehicle {
    protected String regnNumber, color, ownerName;
    protected int speed;

    public void showData() {
        System.out.println("This is a vehicle class.");
    }
}

class Bus extends Vehicle {
    private String routeNumber;

    public Bus(String regnNumber, String color, String ownerName, int speed, String routeNumber) {
        this.regnNumber = regnNumber;
        this.color = color;
        this.ownerName = ownerName;
        this.speed = speed;
        this.routeNumber = routeNumber;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Bus details - Route: " + routeNumber + ", Regn Number: " + regnNumber +
                ", Color: " + color + ", Speed: " + speed + ", Owner: " + ownerName);
    }
}

class Car extends Vehicle {
    private String manufacturerName;

    public Car(String regnNumber, String color, String ownerName, int speed, String manufacturerName) {
        this.regnNumber = regnNumber;
        this.color = color;
        this.ownerName = ownerName;
        this.speed = speed;
        this.manufacturerName = manufacturerName;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Car details - Manufacturer: " + manufacturerName + ", Regn Number: " + regnNumber +
                ", Color: " + color + ", Speed: " + speed + ", Owner: " + ownerName);
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Bus bus = new Bus("B123", "Red", "John Doe", 60, "Route 101");
        bus.showData();
        
        Car car = new Car("C123", "Blue", "Jane Doe", 120, "Toyota");
        car.showData();
    }
}
