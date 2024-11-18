import java.util.Scanner;

class ThreeDObject {
    public double wholeSurfaceArea() {
        return 0;
    }
    
    public double volume() {
        return 0;
    }
}

class Box extends ThreeDObject {
    private double length, width, height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    public double volume() {
        return length * width * height;
    }
}

class Cube extends Box {
    public Cube(double side) {
        super(side, side, side);
    }
}

class Cylinder extends ThreeDObject {
    private double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

class Cone extends ThreeDObject {
    private double radius, height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
    }

    @Override
    public double volume() {
        return (Math.PI * radius * radius * height) / 3;
    }
}

public class ThreeDObjectTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Box test
        System.out.print("Enter length, width, height for Box: ");
        double boxLength = sc.nextDouble();
        double boxWidth = sc.nextDouble();
        double boxHeight = sc.nextDouble();
        Box box = new Box(boxLength, boxWidth, boxHeight);
        System.out.println("Box Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());

        // Cylinder test
        System.out.print("Enter radius, height for Cylinder: ");
        double cylRadius = sc.nextDouble();
        double cylHeight = sc.nextDouble();
        Cylinder cylinder = new Cylinder(cylRadius, cylHeight);
        System.out.println("Cylinder Surface Area: " + cylinder.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());

        // Cone test
        System.out.print("Enter radius, height for Cone: ");
        double conRadius = sc.nextDouble();
        double conHeight = sc.nextDouble();
        Cone cone = new Cone(conRadius, conHeight);
        System.out.println("Cone Surface Area: " + cone.wholeSurfaceArea());
        System.out.println("Cone Volume: " + cone.volume());

        sc.close();
    }
}
