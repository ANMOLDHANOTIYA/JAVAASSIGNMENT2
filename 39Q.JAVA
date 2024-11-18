public class MethodOverloading {
    public void display(int num) {
        System.out.println("Number: " + num);
    }

    public void display(String text) {
        System.out.println("Text: " + text);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.display(10);
        obj.display("Hello");
    }
}
