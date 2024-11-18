public class ConstructorOverloading {
    private int num;
    private String name;

    // Constructor with one parameter
    public ConstructorOverloading(int num) {
        this.num = num;
        System.out.println("Number: " + num);
    }

    // Constructor with two parameters
    public ConstructorOverloading(int num, String name) {
        this.num = num;
        this.name = name;
        System.out.println("Number: " + num + ", Name: " + name);
    }

    public static void main(String[] args) {
        new ConstructorOverloading(10);
        new ConstructorOverloading(20, "Alice");
    }
}
