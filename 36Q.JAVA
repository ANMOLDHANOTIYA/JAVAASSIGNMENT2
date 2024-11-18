public class ParameterizedConstructor {
    private int num;

    // Parameterized constructor
    public ParameterizedConstructor(int num) {
        this.num = num;
        System.out.println("The number is: " + num);
    }

    public static void main(String[] args) {
        new ParameterizedConstructor(25);  // Creating object with argument
    }
}
