public class ZeroArgumentsConstructor {
    public ZeroArgumentsConstructor() {
        System.out.println("This is a 0-arguments constructor.");
    }

    public static void main(String[] args) {
        new ZeroArgumentsConstructor();  // Creating object invokes constructor
    }
}
